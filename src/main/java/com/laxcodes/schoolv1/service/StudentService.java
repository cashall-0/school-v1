package com.laxcodes.schoolv1.service;

import com.laxcodes.schoolv1.dtoModels.StudentProfileDto;
import com.laxcodes.schoolv1.entities.Assignment;
import com.laxcodes.schoolv1.entities.Classroom;
import com.laxcodes.schoolv1.entities.Course;
import com.laxcodes.schoolv1.entities.StudentProfile;
import com.laxcodes.schoolv1.enums.ActionStatus;

public interface StudentService {
    long createStudentProfile(String email, StudentProfileDto studentProfileDto);
    ActionStatus updateStudentProfile(long id, StudentProfileDto studentProfileDto);
    ActionStatus updateStudentProfile(String matricNumber, StudentProfileDto studentProfileDto);
    StudentProfile findStudentProfile(long id);
    StudentProfile findStudentProfile(String matricNumber);
    ActionStatus deleteStudentProfile(long id);
    ActionStatus registerCourse(Course course, String matricNumber);
    ActionStatus unregisterCourse(long courseId, String matricNumber);
    ActionStatus applyForExtraUnit(long semesterId, int noOfExtraUnits, String matricNumber);
    ActionStatus uploadAssingment(long classRoomId, Assignment assignment);
}
