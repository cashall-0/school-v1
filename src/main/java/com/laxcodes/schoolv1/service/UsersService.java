package com.laxcodes.schoolv1.service;

import com.laxcodes.schoolv1.dtoModels.UserDto;
import com.laxcodes.schoolv1.entities.Users;
import com.laxcodes.schoolv1.enums.ActionStatus;
import com.laxcodes.schoolv1.enums.UserRole;
import com.laxcodes.schoolv1.security.models.RegRequest;

import java.util.List;

public interface UsersService {
    Long registerNewUser(RegRequest regRequest, UserRole role);
    ActionStatus updateUser(UserDto userdto);
    Users findUser(String email, UserRole userRole);
    Users findUser(long id, UserRole userRole);
    Users findUser(long id);
    Users findUser(String email);
    ActionStatus deleteUser(String email);
    List<Users> getListOfStudents();
    List<Users> getListOfStaff();


}
