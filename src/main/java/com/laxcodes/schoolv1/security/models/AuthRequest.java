package com.laxcodes.schoolv1.security.models;

import lombok.Data;
@Data
public class AuthRequest {
    private String userNameOrEmail;
    private String password;
}
