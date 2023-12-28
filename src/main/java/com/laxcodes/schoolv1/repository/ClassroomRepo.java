package com.laxcodes.schoolv1.repository;

import com.laxcodes.schoolv1.entities.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepo extends JpaRepository<Classroom, Long> {
}
