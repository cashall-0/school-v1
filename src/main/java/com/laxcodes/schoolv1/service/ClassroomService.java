package com.laxcodes.schoolv1.service;

import com.laxcodes.schoolv1.entities.Classroom;
import com.laxcodes.schoolv1.entities.StaffProfile;
import com.laxcodes.schoolv1.enums.ActionStatus;


public interface ClassroomService {
    //the class connects a lecturer, a course and many students
    ActionStatus createClassroom(StaffProfile staffProfile);
    Classroom findClassroom(long id);
    ActionStatus updateClassroom(Classroom classroom);
    ActionStatus deleteClassroom(long id);
    ActionStatus clearAllNotices(Classroom classroom);
}
