package com.laxcodes.schoolv1.service;

import com.laxcodes.schoolv1.entities.Course;
import com.laxcodes.schoolv1.enums.ActionStatus;

public interface CourseService {
    ActionStatus createCourses(Course course);
    Course findCourse(long courseId);
    Course findCourse(String courseCode);
    ActionStatus updateCourse(Course course);
    ActionStatus deleteCourse(String courseCode);
}
