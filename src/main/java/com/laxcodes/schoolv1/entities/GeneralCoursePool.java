package com.laxcodes.schoolv1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class GeneralCoursePool extends BaseData {
    @OneToMany //TODO check if this is correct one to many
    private List<Course> courses;
}
