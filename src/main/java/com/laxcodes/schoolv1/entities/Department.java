package com.laxcodes.schoolv1.entities;

import com.laxcodes.schoolv1.enums.Faculties;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Department extends BaseData{
    private String departmentName;
    private boolean accredited;
    @Enumerated(EnumType.STRING)
    private Faculties faculty;
    @OneToOne
    private StaffProfile headOfDepartment;
}
