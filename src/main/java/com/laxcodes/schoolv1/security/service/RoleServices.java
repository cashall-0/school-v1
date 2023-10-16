package com.laxcodes.schoolv1.security.service;

import com.swiftcodes.authsample.security.models.WebRole;
import com.swiftcodes.authsample.security.repository.RoleRepo;
import com.swiftcodes.authsample.security.utils.AppRoles;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServices {
    private final RoleRepo roleRepo;

    public WebRole createOrGetExistingRole(AppRoles role){
        return roleRepo.findWebRoleByRole(role).orElseGet(()->{
            WebRole newAppRole = new WebRole();
            newAppRole.setRole(role);
            return roleRepo.save(newAppRole);
        });
    }

}
