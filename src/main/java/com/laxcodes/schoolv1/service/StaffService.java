package com.laxcodes.schoolv1.service;

import com.laxcodes.schoolv1.dtoModels.StaffProfileDto;
import com.laxcodes.schoolv1.entities.*;
import com.laxcodes.schoolv1.enums.ActionStatus;

import java.util.List;

public interface StaffService {
    //everything about staff functionality
    long createStaffProfile(long userId, StaffProfile staffProfile);
    ActionStatus updateStaffProfile(long profileId, StaffProfileDto staffProfileDto);
    StaffProfile findStaffProfile(long profileId);
    ActionStatus deleteStaffProfile(long profileIid);
    ActionStatus uploadAssignment(Assignment assignment, long classroomId);
    ActionStatus uploadNotice(Classroom classroom, String notice);
//    ActionStatus uploadFile();
    List<Course> findAllSemesterCourses(StaffProfile staffProfile);
    List<Users> findAllStudentsRegisteredForACourse(Classroom classroom);
    ActionStatus awardMark();
    ActionStatus editScore();

}
