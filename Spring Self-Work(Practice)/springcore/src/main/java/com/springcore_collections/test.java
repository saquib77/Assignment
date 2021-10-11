package com.springcore_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_collections/collection_config.xml");
		Student stu1 = (Student)context.getBean("student1");
		System.out.println(stu1);
		System.out.println(stu1.getCourses().getClass().getName());
	}

}
