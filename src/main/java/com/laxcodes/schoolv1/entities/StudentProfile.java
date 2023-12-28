package com.laxcodes.schoolv1.entities;

import com.laxcodes.schoolv1.dtoModels.StudentProfileDto;
import com.laxcodes.schoolv1.enums.EnrollmentStatus;
import com.laxcodes.schoolv1.enums.StudentLevel;
import com.laxcodes.schoolv1.util.UtilMethods;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
public class StudentProfile extends BaseData{
    @Column(unique = true)
    private String matricNumber;
    private double gpa;
    private Date enrollmentdate;
    @Enumerated(EnumType.STRING)
    private EnrollmentStatus enrollmentStatus;
    @Enumerated(EnumType.STRING)
    private StudentLevel studentLevel;

    @ManyToOne
    private Department department;
    @OneToMany
    private List<Semester> semesterList;
    @OneToOne
    private  Users user;
//todo added this one to many relationship for students semesters
    public StudentProfile(Users user, StudentProfileDto studentProfileDto) {
        this.user = user;
        this.matricNumber = UtilMethods.createRegNo();
        this.department = studentProfileDto.getDepartment();
        this.enrollmentdate = new Date();
        this.gpa = 0;
        this.enrollmentStatus = EnrollmentStatus.ENROLLED;
        this.semesterList = new ArrayList<>();
        this.studentLevel = studentProfileDto.getStudentLevel();
    }
}
