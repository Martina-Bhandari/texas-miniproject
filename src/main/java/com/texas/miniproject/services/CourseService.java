//CourseService
package com.texas.miniproject.services;

import com.texas.miniproject.entity.Course;
import java.util.List;
import java.util.Optional;


public interface CourseService {
    List<Course> getAllCourses();
    Optional<Course> getCourseById(Long id);
    Course saveCourse(Course course);
    void deleteCourse(Long id);

    Course update(Course courseDetails);
}