package com.bridgelabz.autowirebyconstructor;

public class Shop {
	
	private Fruit fruit;
	

	public Shop(Fruit fruit) {
		super();
		this.fruit = fruit;
	}


	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	
	
	public void startFruit() {
		
		if(fruit != null) {
			System.out.println("eating fruits...enjoy");
			fruit.eating();
		} else {
			System.out.println("Nothing to eat...");
		}
	}
	
	

}
