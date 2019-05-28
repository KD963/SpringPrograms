package com.bridgelabz.setter;

public class Student {

	private int rollNo;
	private String name;
	private String address;

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void displayStudentInfo() {
		System.out.println("Student name is  " + name);
		System.out.println("Student roll no is " + rollNo); 
		System.out.println("Student address is " + address);
	}

}
