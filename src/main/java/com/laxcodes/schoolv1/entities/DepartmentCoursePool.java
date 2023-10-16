package com.laxcodes.schoolv1.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class DepartmentCoursePool extends BaseData{
    private boolean isApproved;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Course> course;
    @OneToOne
    private Department department;

}
