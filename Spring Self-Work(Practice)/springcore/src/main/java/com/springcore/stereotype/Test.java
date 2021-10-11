package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo_config.xml");
		Student stu = context.getBean("student",Student.class);
		System.out.println(stu);
		System.out.println(stu.getCities());
	}

}
