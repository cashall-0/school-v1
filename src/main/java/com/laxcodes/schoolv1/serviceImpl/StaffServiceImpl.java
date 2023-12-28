package com.laxcodes.schoolv1.serviceImpl;

import com.laxcodes.schoolv1.dtoModels.StaffProfileDto;
import com.laxcodes.schoolv1.entities.*;
import com.laxcodes.schoolv1.enums.ActionStatus;
import com.laxcodes.schoolv1.repository.StaffProfileRepo;
import com.laxcodes.schoolv1.service.StaffService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StaffServiceImpl implements StaffService {
    private final StaffProfileRepo staffProfileRepo;


    @Override
    public long createStaffProfile(long userId, StaffProfile staffProfile) {
        return 0;
    }

    @Override
    public ActionStatus updateStaffProfile(long profileId, StaffProfileDto staffProfileDto) {
        return null;
    }

    @Override
    public StaffProfile findStaffProfile(long profileId) {
        return null;
    }

    @Override
    public ActionStatus deleteStaffProfile(long profileIid) {
        return null;
    }

    @Override
    public ActionStatus uploadAssignment(Assignment assignment, long classroomId) {
        return null;
    }

    @Override
    public ActionStatus uploadNotice(Classroom classroom, String notice) {
        return null;
    }

    @Override
    public List<Course> findAllSemesterCourses(StaffProfile staffProfile) {
        return null;
    }

    @Override
    public List<Users> findAllStudentsRegisteredForACourse(Classroom classroom) {
        return null;
    }

    @Override
    public ActionStatus awardMark() {
        return null;
    }

    @Override
    public ActionStatus editScore() {
        return null;
    }
}