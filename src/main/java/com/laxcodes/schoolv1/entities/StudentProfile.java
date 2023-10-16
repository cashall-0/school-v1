package com.laxcodes.schoolv1.entities;

import com.laxcodes.schoolv1.enums.EnrollmentStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class StudentProfile extends BaseData{
    private Long matricNumber;
    private double gpa;
    private Date enrollmentdate;
    @Enumerated(EnumType.STRING)
    private EnrollmentStatus enrollmentStatus;

    @ManyToOne
    private Department department;
    @OneToOne
    private  Users user;

}
