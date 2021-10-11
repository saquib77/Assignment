package com.spring.jdbc.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.springjdbc.entity.Student;

public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public StudentDaoImpl() {}

	public int insert(Student student) {
		String query = "insert into student(id,name,city)values(?,?,?)";
		return this.jdbcTemplate.update(query, student.getId(),student.getName(),student.getCity() );
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int update(Student student) {
		String query = "update student set name=?,city=? where id=?";
		return this.jdbcTemplate.update(query, student.getName(),student.getCity(),student.getId());
	}

	
	
	public Student getStudent(int id) {
		String query = "select * from student where id=?";
		RowMapper<Student>rowMapper = new RowMapperImpl();
		return this.jdbcTemplate.queryForObject(query, rowMapper, id);
	}
	
	

	

}
