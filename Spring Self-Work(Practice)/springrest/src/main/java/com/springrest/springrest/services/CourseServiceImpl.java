package com.springrest.springrest.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.coursedao.CourseDao;
import com.springrest.springrest.entity.Courses;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {}
	
	@Override
	public List<Courses> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Courses getCourseById(Long courseId) {
		return courseDao.getById(courseId);
	}

	@Override
	public Courses addCourse(Courses course) {
		return courseDao.save(course);
	}

	@Override
	public Courses updateCourse(Courses course) {
		return courseDao.save(course);
		
	}

	@Override
	public void deleteCourse(Long courseId) {
		courseDao.deleteById(courseId);
	}

	@Override
	public void deleteAll() {
		courseDao.deleteAll();
	}

}
