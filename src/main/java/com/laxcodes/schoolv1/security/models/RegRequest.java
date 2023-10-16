package com.laxcodes.schoolv1.security.models;

import lombok.Data;

@Data
public class RegRequest {
    private String email;
    private String password;
}
