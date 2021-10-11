package com.springcore_collections;

import java.util.*;

public class Student {
	private String studentName;
	private List<String> books;
	private Set<String> courses;
	private Map<String , String> coursesCom;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<String> getBooks() {
		return books;
	}
	public void setBooks(List<String> books) {
		this.books = books;
	}
	public Set<String> getCourses() {
		return courses;
	}
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	public Map<String, String> getCoursesCom() {
		return coursesCom;
	}
	public void setCoursesCom(Map<String, String> coursesCom) {
		this.coursesCom = coursesCom;
	}
	public Student(String studentName, List<String> books, Set<String> courses, Map<String, String> coursesCom) {
		super();
		this.studentName = studentName;
		this.books = books;
		this.courses = courses;
		this.coursesCom = coursesCom;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", books=" + books + ", courses=" + courses + ", coursesCom="
				+ coursesCom + "]";
	}
	
	
}
