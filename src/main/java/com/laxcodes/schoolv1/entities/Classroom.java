package com.laxcodes.schoolv1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
//TODO write about the addition of class entity
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Classroom extends BaseData{
    @OneToMany
    private List<StaffProfile> lecturers;
    @OneToMany
    private List<StudentProfile> students;
    @OneToMany
    private List<Assignment> assignments;
    @ManyToOne
    private Course course;
}
