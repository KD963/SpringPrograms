package com.bridgelabz.autowiredbytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Shop shop = applicationContext.getBean("shop", Shop.class);
		shop.network();

	}

}
