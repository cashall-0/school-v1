package com.laxcodes.schoolv1.entities;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Result extends BaseData{
    private double score;
    private char grade;
    @ManyToOne
    private Course course;
    @OneToOne
    private StudentProfile studentProfile;

}
