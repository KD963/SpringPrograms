package com.bridgelabz.constructor;

public class StudentDemo {

	private int rollNo;
	private String name;
	private String address;

	public StudentDemo(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	
	
	public void displayStudentInfo() {
		System.out.println("Student roll no is " + rollNo);
		System.out.println("Student name is " + name);
		System.out.println("Student address is " + address);
		
		
	}
 
}
