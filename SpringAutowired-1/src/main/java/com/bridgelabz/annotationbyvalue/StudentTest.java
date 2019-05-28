package com.bridgelabz.annotationbyvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {

		

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanV.xml");
		Student student = applicationContext.getBean("student", Student.class);
		System.out.println("-----------------------------------------------");
		student.displayStudent();
	}
}
