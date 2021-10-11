package com.springrest.springrest.services;
import java.util.List;
import com.springrest.springrest.entity.Courses;


public interface CourseService {
	public List<Courses> getCourses();
	public Courses getCourseById(Long courseId);
	public Courses addCourse(Courses course);
	public Courses updateCourse(Courses course);
	public void deleteCourse(Long courseId);
	public void deleteAll();
}
