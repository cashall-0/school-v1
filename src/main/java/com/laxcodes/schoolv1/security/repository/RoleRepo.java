package com.laxcodes.schoolv1.security.repository;

import com.swiftcodes.authsample.security.models.WebRole;
import com.swiftcodes.authsample.security.utils.AppRoles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<WebRole, Integer> {
    //note: web role is the model class while App role is an enum
     Optional<WebRole> findWebRoleByRole(AppRoles role);
}
