package com.springcore.cons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("com/springcore/cons/config.xml");
		Cons c1 = (Cons)cont.getBean("Cons");
		System.out.println(c1);
	}

}
