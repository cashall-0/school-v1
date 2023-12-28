package com.laxcodes.schoolv1.entities;

import com.laxcodes.schoolv1.enums.SemesterType;
import com.laxcodes.schoolv1.enums.StudentLevel;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Semester extends  BaseData{
    //TODO I added semester to keep record of student semester details and it's details
    private int maxUnit;
    private int totalUnit;

    @Enumerated(EnumType.STRING)
    private SemesterType semesterType;
    @Enumerated(EnumType.STRING)
    private StudentLevel level;

    @ManyToOne
    private StudentProfile studentProfile;
}
