package com.laxcodes.schoolv1.repository;

import com.laxcodes.schoolv1.entities.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentProfileRepo extends JpaRepository<StudentProfile, Long> {
    Optional<StudentProfile> findByMatricNumber(String matricNumber);
}
