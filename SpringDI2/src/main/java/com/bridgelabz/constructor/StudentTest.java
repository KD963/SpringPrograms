package com.bridgelabz.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	
	public static void main(String[] args) {
		
		System.out.println("before a context");
		ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("spconfig.xml");
		System.out.println("after  a context");

		System.out.println("--------------------------------------------");
		
		StudentDemo studentDemo = applicationContext.getBean("studentDemo" , StudentDemo.class);
		studentDemo.displayStudentInfo();
		System.out.println("after a disp");
		
		System.out.println("--------------------------------------------");
		StudentDemo studentDemo2 = applicationContext.getBean("tourist", StudentDemo.class);
		System.out.println("After studentdemo2");
		studentDemo2.displayStudentInfo();

	}

}
