package com.laxcodes.schoolv1.serviceImpl;

import com.laxcodes.schoolv1.entities.Course;
import com.laxcodes.schoolv1.enums.ActionStatus;
import com.laxcodes.schoolv1.repository.CourseRepo;
import com.laxcodes.schoolv1.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CourseServiceImpl implements CourseService {
    private final CourseRepo courseRepo;
    @Override
    public ActionStatus createCourses(Course course) {
        Course course1 = saveCourse(course);
        if(course1.getCourseTitle()!=null)
            return ActionStatus.SUCCESS;
        return ActionStatus.FAILED;
    }

    @Override
    public Course findCourse(long courseId) {
        Optional<Course> byId = courseRepo.findById(courseId);
        return byId.orElse(null);
    }

    @Override
    public Course findCourse(String courseCode) {
        return courseRepo.findByCourseCode(courseCode).orElse(null);
    }

    @Override
    public ActionStatus updateCourse(Course course) {
        Course course1 = findCourse(course.getId());
        course1.setCourseCode(course.getCourseCode());
        course1.setCourseTitle(course.getCourseTitle());
        course1.setGeneralCoursePool(course.getGeneralCoursePool());
        course1.setDepartmentCoursePool(course.getDepartmentCoursePool());
        course1.setDescription(course.getDescription());
        course1.setCreditUnit(course.getCreditUnit());
        saveCourse(course1);
        return ActionStatus.SUCCESS;
    }

    @Override
    public ActionStatus deleteCourse(String courseCode) {
        Course course = findCourse(courseCode);
        courseRepo.deleteById(course.getId());
        return findCourse(courseCode)!=null? ActionStatus.FAILED:ActionStatus.SUCCESS;
    }
    private Course saveCourse(Course course){
        return courseRepo.save(course);
    }
}
