package com.laxcodes.schoolv1.entities;

import com.laxcodes.schoolv1.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
@EqualsAndHashCode(callSuper = true)
@Data
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
}
