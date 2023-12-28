package com.laxcodes.schoolv1.repository;

import com.laxcodes.schoolv1.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepo extends JpaRepository<Course, Long> {
    Optional<Course> findByCourseCode(String courseCode);
}
