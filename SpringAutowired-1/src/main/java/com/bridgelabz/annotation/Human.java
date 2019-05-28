package com.bridgelabz.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	private Run run;

	public Human() {

	}

	@Autowired
	public Human(Run run) {

		this.run = run;
	}

	public void setRun(Run run) {
		this.run = run;
	}

	public void play() {
		System.out.println("Playing....");
		run.running();
	}

}
