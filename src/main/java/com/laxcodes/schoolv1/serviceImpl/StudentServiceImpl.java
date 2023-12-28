package com.laxcodes.schoolv1.serviceImpl;

import com.laxcodes.schoolv1.dtoModels.StudentProfileDto;
import com.laxcodes.schoolv1.entities.Assignment;
import com.laxcodes.schoolv1.entities.Course;
import com.laxcodes.schoolv1.entities.StudentProfile;
import com.laxcodes.schoolv1.entities.Users;
import com.laxcodes.schoolv1.enums.ActionStatus;
import com.laxcodes.schoolv1.repository.DepartmentCoursePoolRepo;
import com.laxcodes.schoolv1.repository.GeneralCoursePoolRepo;
import com.laxcodes.schoolv1.repository.StudentProfileRepo;
import com.laxcodes.schoolv1.service.StudentService;
import com.laxcodes.schoolv1.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentProfileRepo studentProfileRepo;
    private final DepartmentCoursePoolRepo departmentCoursePoolRepo;
    private final GeneralCoursePoolRepo generalCoursePoolRepo;
    private final UsersService usersService;


    public StudentProfile saveStudentProfile(StudentProfile studentProfile){
        return studentProfileRepo.save(studentProfile);
    }

    @Override
    public long createStudentProfile(String email, StudentProfileDto studentProfileDto) {
        Users user = usersService.findUser(email);
        StudentProfile studentProfile = new StudentProfile(user, studentProfileDto);
        StudentProfile studentProfile1 = saveStudentProfile(studentProfile);
        return studentProfile1 != null ? studentProfile1.getId() : 0L;
    }

    @Override
    public ActionStatus updateStudentProfile(long id, StudentProfileDto studentProfileDto) {
        return null;
    }

    @Override
    public ActionStatus updateStudentProfile(String matricNumber, StudentProfileDto studentProfileDto) {
        StudentProfile studentProfile = findStudentProfile(matricNumber);
        studentProfile.setStudentLevel(studentProfileDto.getStudentLevel());
        studentProfile.setDepartment(studentProfileDto.getDepartment());
        studentProfile.setEnrollmentStatus(studentProfileDto.getEnrollmentStatus());
        studentProfile.setGpa(studentProfileDto.getGpa());
        studentProfile.setSemesterList(studentProfileDto.getSemesterList());
        StudentProfile studentProfile1 = saveStudentProfile(studentProfile);
        return studentProfile.getId() == studentProfile1.getId() ? ActionStatus.SUCCESS: ActionStatus.FAILED;
    }

    @Override
    public StudentProfile findStudentProfile(long id) {
        return null;
    }

    @Override
    public StudentProfile findStudentProfile(String matricNumber) {
        Optional<StudentProfile> byMatricNumber = studentProfileRepo.findByMatricNumber(matricNumber);
        return byMatricNumber.orElse(null);
    }

    @Override
    public ActionStatus deleteStudentProfile(long id) {
        studentProfileRepo.deleteById(id);
        StudentProfile studentProfile = findStudentProfile(id);
        return studentProfile == null? ActionStatus.SUCCESS: ActionStatus.FAILED;
    }

    @Override
    public ActionStatus registerCourse(Course course, String matricNumber) {
        return null;
    }

    @Override
    public ActionStatus unregisterCourse(long courseId, String matricNumber) {
        return null;
    }

    @Override
    public ActionStatus applyForExtraUnit(long semesterId, int noOfExtraUnits, String matricNumber) {
        return null;
    }

    @Override
    public ActionStatus uploadAssingment(long classRoomId, Assignment assignment) {
        return null;
    }
}
