package com.springrest.springrest.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springrest.springrest.entity.Courses;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	//Home page
	@GetMapping("/home")
	public String home() {
		return "this is home page courses";
	}
	
	//Get all course
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		return this.courseService.getCourses();
	}
	
	//Get A single course by id
	@GetMapping("/courses/{courseId}")
	public Courses getCourseById(@PathVariable("courseId") String courseId) {
		return this.courseService.getCourseById(Long.parseLong(courseId));
	}
	
	//Add a course
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course) {
		return this.courseService.addCourse(course);
	}
	
	//Update course
	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses course) {
		return this.courseService.updateCourse(course);
	}
	
	//delete course by id
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable("courseId") String courseId) {
		try {
			this.courseService.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(e);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	//delete all courses
	@DeleteMapping("/courses/deleteAll")
	public ResponseEntity<HttpStatus> deleteAll(){
		try {
			this.courseService.deleteAll();
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
