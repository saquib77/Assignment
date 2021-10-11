package com.springcore.lcycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lcycle/config.xml");
//		
//		Book b1 = (Book)context.getBean("book1");
//		System.out.println(b1);
//		
		context.registerShutdownHook();
//		
//		Desk d1 = (Desk)context.getBean("desk1");
//		System.out.println(d1);
//		
//		context.registerShutdownHook();
		Textbook tb1 = (Textbook)context.getBean("tb1");
		System.out.println(tb1);
		
	}

}
