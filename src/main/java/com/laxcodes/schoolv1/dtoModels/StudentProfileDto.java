package com.laxcodes.schoolv1.dtoModels;

import com.laxcodes.schoolv1.entities.Department;
import com.laxcodes.schoolv1.entities.Semester;
import com.laxcodes.schoolv1.entities.StudentProfile;
import com.laxcodes.schoolv1.entities.Users;
import com.laxcodes.schoolv1.enums.EnrollmentStatus;
import com.laxcodes.schoolv1.enums.StudentLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class StudentProfileDto {
    private long id;
    private String matricNumber;
    private double gpa;
    private Date enrollmentdate;
    private EnrollmentStatus enrollmentStatus;
    private StudentLevel studentLevel;
    private Department department;
    private List<Semester> semesterList;
    private Users user;

    public StudentProfileDto(StudentProfile studentProfile) {
        this.id = studentProfile.getId();
        this.matricNumber = studentProfile.getMatricNumber();
        this.gpa = studentProfile.getGpa();
        this.enrollmentdate = studentProfile.getEnrollmentdate();
        this.enrollmentStatus = studentProfile.getEnrollmentStatus();
        this.department = studentProfile.getDepartment();
        this.user = studentProfile.getUser();
        this.semesterList = studentProfile.getSemesterList();
        this.studentLevel = studentProfile.getStudentLevel();
    }
}
