package com.higheredu.api.monolithic.service;

import java.util.List;

import com.higheredu.api.monolithic.dto.CourseDto;
import com.higheredu.api.monolithic.model.Course;

public interface CourseService {

	 Course createCourse(Course course);

	    CourseDto getCourseById(Long courseId);

	    List<CourseDto> getAllCourses();

	    Course updateCourse(Long courseId, Course course);

	    void deleteCourseById(Long courseId);
}
