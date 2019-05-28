package com.bridgelabz.autowirebyconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FruitTest {

	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanC.xml");
		Shop shop = applicationContext.getBean("shop", Shop.class);
		shop.startFruit();
		
	}
}
