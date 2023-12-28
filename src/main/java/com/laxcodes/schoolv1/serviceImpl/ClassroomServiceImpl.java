package com.laxcodes.schoolv1.serviceImpl;

import com.laxcodes.schoolv1.entities.Classroom;
import com.laxcodes.schoolv1.entities.StaffProfile;
import com.laxcodes.schoolv1.enums.ActionStatus;
import com.laxcodes.schoolv1.service.ClassroomService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClassroomServiceImpl implements ClassroomService {

    @Override
    public ActionStatus createClassroom(StaffProfile staffProfile) {
        return null;
    }

    @Override
    public Classroom findClassroom(long id) {
        return null;
    }

    @Override
    public ActionStatus updateClassroom(Classroom classroom) {
        return null;
    }

    @Override
    public ActionStatus deleteClassroom(long id) {
        return null;
    }

    @Override
    public ActionStatus clearAllNotices(Classroom classroom) {
        return null;
    }
}
