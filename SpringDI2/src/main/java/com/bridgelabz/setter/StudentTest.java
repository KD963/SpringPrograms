package com.bridgelabz.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Student student = applicationContext.getBean("student" ,Student.class);
		student.displayStudentInfo();
		
		System.out.println("---------------------------");
		Student student2  = applicationContext.getBean("aaron", Student.class);
		student2.displayStudentInfo();
	}

}
