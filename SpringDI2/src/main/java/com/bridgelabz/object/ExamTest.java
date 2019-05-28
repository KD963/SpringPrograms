package com.bridgelabz.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamTest {

	public static void main(String[] args) {
		
		/*
		 * Student2 student2 = new Student2(); Exam exam = new Exam();
		 * student2.setExam1(exam); student2.startExam();
		 */
		
		System.out.println("before context");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans1.xml");
		System.out.println("after context");
		Student2 student2 = applicationContext.getBean("stud", Student2.class);
	
		student2.startExam();
		
		
		AnotherStudent anotherStudent = applicationContext.getBean("anotherstud", AnotherStudent.class);
		anotherStudent.startExam();
		
	
	}
}
