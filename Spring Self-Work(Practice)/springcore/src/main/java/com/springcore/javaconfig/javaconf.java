package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaconf {
	
	@Bean
	public Book getBook() {
		return new Book();
	}
	
	@Bean
	public Student getStudent() {
		//creating student object
		Student student = new Student(getBook());
		return student;
	}
	
}
