package com.laxcodes.schoolv1.service;

import com.laxcodes.schoolv1.dtoModels.StudentProfileDto;
import com.laxcodes.schoolv1.entities.StudentProfile;
import com.laxcodes.schoolv1.enums.ActionStatus;

public interface StudentService {
    Long createStudentProfile(Long id, StudentProfile studentProfile);
    ActionStatus updateStudentProfile(Long Id, StudentProfileDto studentProfileDto);
}
