package com.springrest.springrest.coursedao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.Courses;

public interface CourseDao extends JpaRepository<Courses, Long>{
	
}
