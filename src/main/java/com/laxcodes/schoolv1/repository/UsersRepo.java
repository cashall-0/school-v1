package com.laxcodes.schoolv1.repository;

import com.laxcodes.schoolv1.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<Users, Long> {
    Optional<Users> findByEmail(String email);
}
