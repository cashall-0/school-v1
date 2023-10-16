package com.laxcodes.schoolv1.security.service;

import com.laxcodes.schoolv1.entities.Users;
import com.laxcodes.schoolv1.repository.UsersRepo;
import com.laxcodes.schoolv1.security.models.CustomUserDetails;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;
@Transactional
@RequiredArgsConstructor
@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UsersRepo usersRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = usersRepo.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not Found"));
        if(Objects.nonNull(users)){
            return new CustomUserDetails(users);
        }
        return null;
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
