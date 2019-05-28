package com.bridgelabz.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HumanTest {

	public static void main(String[] args) {

		System.out.println("before application context");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanQ.xml");
		Human human = applicationContext.getBean("human", Human.class);
		human.displayGame();
	}
}
