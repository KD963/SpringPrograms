package com.bridgelabz.annotationComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.bridgelabz.annotationComponent")
@Component
public class College {
	
	@Autowired
	private Teacher teacher;
	
	public College()
	{}
	
	public void test()
	{
		teacher.teach();
	}
	
}
