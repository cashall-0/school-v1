package com.laxcodes.schoolv1.security.repository;

import com.swiftcodes.authsample.security.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<Users, Integer> {
    Optional<Users> findByEmail(String email);
}
