package com.laxcodes.schoolv1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Course extends BaseData{
    @Column(unique = true)
    private String courseCode; //TODO create a model and method for creating a course code
    private String courseTitle;
    private int creditUnit;
    private String description;
    @ManyToOne
    private DepartmentCoursePool departmentCoursePool;
    @ManyToOne
    private GeneralCoursePool generalCoursePool;

}
