package com.laxcodes.schoolv1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class StaffProfile extends BaseData{
    private double salary;

    @ManyToOne
    private Department department;
    @OneToOne
    private Users users;
}
