package com.laxcodes.schoolv1.service;

import com.laxcodes.schoolv1.dtoModels.Userdto;
import com.laxcodes.schoolv1.entities.Users;
import com.laxcodes.schoolv1.enums.ActionStatus;
import com.laxcodes.schoolv1.enums.UserRole;
import com.laxcodes.schoolv1.security.models.RegRequest;

public interface UsersService {
    Long registerNewUser(RegRequest regRequest, UserRole role);
    ActionStatus updateUser(String email, Userdto userdto);
    Users findUser(String email, UserRole userRole);
    Users findUser(long id, UserRole userRole);
    Users findUser(String email);
    ActionStatus deleteUser(String email);


}
