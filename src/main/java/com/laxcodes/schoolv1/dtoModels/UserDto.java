package com.laxcodes.schoolv1.dtoModels;

import com.laxcodes.schoolv1.entities.Users;
import com.laxcodes.schoolv1.enums.UserRole;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.util.Date;
@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date dateOfBirth;
    private String address;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    public UserDto(Users users) {
        this.firstName = users.getFirstName();
        this.lastName = users.getLastName();
        this.email = users.getEmail();
        this.phoneNumber = users.getPhoneNumber();
        this.dateOfBirth = users.getDateOfBirth();
        this.address = users.getAddress();
        this.userRole = users.getUserRole();
    }
}
