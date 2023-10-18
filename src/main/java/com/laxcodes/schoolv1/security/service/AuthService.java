package com.laxcodes.schoolv1.security.service;

import com.laxcodes.schoolv1.security.models.AuthRequest;
import com.laxcodes.schoolv1.security.utils.JwtUtilMethods;
import lombok.AllArgsConstructor;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class AuthService {
    private final AuthenticationManager authenticationManager;
    private final JwtUtilMethods jwtUtil;


    public String authenticateUser(AuthRequest request) {
        Authentication authentication;
        try {
            authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getUserNameOrEmail(), request.getPassword())
            );

        } catch (Exception ex) {
            throw new BadCredentialsException("invalid password/username");
        }
        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        return  jwtUtil.generateToken(userDetails.getUsername());
    }
}
