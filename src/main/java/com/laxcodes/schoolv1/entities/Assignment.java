package com.laxcodes.schoolv1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Assignment extends  BaseData{
    private Date dueDate;
    //todo added to relationships
    @OneToOne
    private StaffProfile assignmentAuthor;
    private String question;
    //todo add classroom to a new relationship added
    @ManyToOne
    private Classroom classroom;
}
