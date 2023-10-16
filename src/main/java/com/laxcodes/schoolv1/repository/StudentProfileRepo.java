package com.laxcodes.schoolv1.repository;

import com.laxcodes.schoolv1.entities.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentProfileRepo extends JpaRepository<StudentProfile, Long> {

}
