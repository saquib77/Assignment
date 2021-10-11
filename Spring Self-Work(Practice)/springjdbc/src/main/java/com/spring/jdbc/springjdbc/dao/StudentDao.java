package com.spring.jdbc.springjdbc.dao;

import com.spring.jdbc.springjdbc.entity.Student;

public interface StudentDao {
	public int insert(Student student); 
	public int update(Student student);
	public Student getStudent(int id);
}
