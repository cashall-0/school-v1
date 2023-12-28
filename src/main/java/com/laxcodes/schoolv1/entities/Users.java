package com.laxcodes.schoolv1.entities;

import com.laxcodes.schoolv1.enums.UserRole;
import com.laxcodes.schoolv1.security.models.RegRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
public class Users extends BaseData{
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date dateOfBirth;
    private String address;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    public Users(RegRequest regRequest, UserRole userRole) {
        this.email = regRequest.getEmail();
        this.password = regRequest.getPassword();
        this.userRole = userRole;
    }
}
