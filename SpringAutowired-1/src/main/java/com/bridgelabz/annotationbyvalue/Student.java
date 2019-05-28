package com.bridgelabz.annotationbyvalue;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	private String firstName;
	private String lastName;

	
	
	@Required
	@Value("Kalyani")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Value("Deobhankar")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Value("Pune")
	public void setAddress(String address) {
		this.address = address;
	}

	private String address;

	public void displayStudent() {
		System.out.println("First name of Student is  " + firstName);
		System.out.println("Last name of Student is " + lastName);
		System.out.println("Address of Student is " + address);

	}

}
