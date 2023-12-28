package com.laxcodes.schoolv1.dtoModels;

import com.laxcodes.schoolv1.entities.Department;
import com.laxcodes.schoolv1.entities.Users;
import com.laxcodes.schoolv1.enums.EnrollmentStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.util.Date;

public class StaffProfileDto {
    private long matricNumber;
    private double gpa;
    private Date enrollmentdate;
    private EnrollmentStatus enrollmentStatus;
    private Department department;
    private Users user;
}
