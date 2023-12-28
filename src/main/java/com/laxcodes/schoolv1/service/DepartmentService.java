package com.laxcodes.schoolv1.service;

import com.laxcodes.schoolv1.entities.Department;
import com.laxcodes.schoolv1.enums.ActionStatus;
public interface DepartmentService {
    Long createNewDepartment(Department department);
    ActionStatus updateDepartment(String departmentName, Department department);
    Department findDepartment(long departmentId);
    Department findDepartment(String departmentName);
    ActionStatus deleteDepartment(String departmentName);
}
