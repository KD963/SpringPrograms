package com.bridgelabz.interfacedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beanM.xml");
		ShopD shop = context.getBean("shopd", ShopD.class);
		shop.test();

	}
}
