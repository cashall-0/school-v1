package com.laxcodes.schoolv1.enums;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
    STUDENT, STAFF;

    @Override
    public String getAuthority() {
        return name();
    }
}
