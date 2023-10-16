package com.laxcodes.schoolv1.repository;

import com.laxcodes.schoolv1.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Long> {
}
