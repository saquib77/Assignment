package com.spring.jdbc.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.springjdbc.dao.StudentDao;
import com.spring.jdbc.springjdbc.entity.Student;

public class App 
{
    public static void main(String[] args){
    	System.out.println("Started......");
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/config.xml");
        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//        Student student = new Student();
//        student.setId(5);
//        student.setName("Ahmed");
//        student.setCity("Noida");
//        int res = studentDao.update(student);
        //System.out.println(res);
        
        System.out.println(studentDao.getStudent(4));
    }
}
 