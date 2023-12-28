package com.laxcodes.schoolv1.serviceImpl;

import com.laxcodes.schoolv1.entities.Department;
import com.laxcodes.schoolv1.enums.ActionStatus;
import com.laxcodes.schoolv1.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Override
    public Long createNewDepartment(Department department) {
        return null;
    }

    @Override
    public ActionStatus updateDepartment(String departmentName, Department department) {
        return null;
    }

    @Override
    public Department findDepartment(long departmentId) {
        return null;
    }

    @Override
    public Department findDepartment(String departmentName) {
        return null;
    }

    @Override
    public ActionStatus deleteDepartment(String departmentName) {
        return null;
    }
}
