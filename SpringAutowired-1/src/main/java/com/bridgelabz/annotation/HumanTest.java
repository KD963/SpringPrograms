package com.bridgelabz.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HumanTest {

	public static void main(String[] args) {

		System.out.println("Autowiring constructor");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanA.xml");
		System.out.println("-------------------------");
		Human human = applicationContext.getBean("human", Human.class);
		human.play();
	}

}
