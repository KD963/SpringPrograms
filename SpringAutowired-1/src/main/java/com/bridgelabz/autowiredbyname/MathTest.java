package com.bridgelabz.autowiredbyname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MathTest {
 public static void main(String[] args) {
	
	 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
	 MathPoint math = applicationContext.getBean("mathPoint" , MathPoint.class);
	 math.draw();
	 
	 
}
}
