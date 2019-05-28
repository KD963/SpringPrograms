package com.bridgelabz.object;

public class Student2 {

	private int id;

	public void setId(int id) {
		this.id = id;
	}

	private Exam exam1;

	public void setExam1(Exam exam1) {
		this.exam1 = exam1;
	}

	public void startExam() {
		exam1.exam();
		System.out.println("My id is " + id );
	}

}
