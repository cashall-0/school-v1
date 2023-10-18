package com.laxcodes.schoolv1.serviceImpl;

import com.laxcodes.schoolv1.dtoModels.Userdto;
import com.laxcodes.schoolv1.entities.Users;
import com.laxcodes.schoolv1.enums.ActionStatus;
import com.laxcodes.schoolv1.enums.UserRole;
import com.laxcodes.schoolv1.security.models.RegRequest;
import com.laxcodes.schoolv1.service.UsersService;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    @Override
    public Long registerNewUser(RegRequest regRequest, UserRole role) {
        return null;
    }

    @Override
    public ActionStatus updateUser(String email, Userdto userdto) {
        return null;
    }

    @Override
    public Users findUser(String email, UserRole userRole) {
        return null;
    }

    @Override
    public Users findUser(long id, UserRole userRole) {
        return null;
    }

    @Override
    public Users findUser(String email) {
        return null;
    }

    @Override
    public ActionStatus deleteUser(String email) {
        return null;
    }
}
