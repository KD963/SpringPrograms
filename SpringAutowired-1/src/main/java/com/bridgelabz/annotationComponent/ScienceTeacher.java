package com.bridgelabz.annotationComponent;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
	
		System.out.println("Science ");
		
	}

}
