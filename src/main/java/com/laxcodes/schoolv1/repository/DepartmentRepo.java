package com.laxcodes.schoolv1.repository;

import com.laxcodes.schoolv1.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Long> {
}
