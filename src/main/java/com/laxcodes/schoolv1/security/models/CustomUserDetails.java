package com.laxcodes.schoolv1.security.models;

import com.laxcodes.schoolv1.entities.Users;
import com.laxcodes.schoolv1.enums.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomUserDetails implements UserDetails {
    private final String email;
    private final String password;
    private final Users user;
    private final Collection<? extends GrantedAuthority> authorities;

    public CustomUserDetails(Users user) {
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.user = user;
        this.authorities = getAuthoritiesNow();

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }
    public Collection<? extends GrantedAuthority> getAuthoritiesNow() {
        Set<UserRole> roles = new HashSet<>();
        roles.add(user.getUserRole());
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getAuthority()))
                .collect(Collectors.toList());

    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
