package com.laxcodes.schoolv1.security.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {
    private String jwtToken;
}
