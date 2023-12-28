package com.laxcodes.schoolv1.repository;

import com.laxcodes.schoolv1.entities.Users;
import com.laxcodes.schoolv1.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface UsersRepo extends JpaRepository<Users, Long> {
    Optional<Users> findByEmail(String email);
    Optional<Users> findByEmailAndUserRole(String email, UserRole userRole);
    Optional<Users> findByIdAndUserRole(long id, UserRole userRole);
    List<Users> findAllByUserRole(UserRole userRole);

}
