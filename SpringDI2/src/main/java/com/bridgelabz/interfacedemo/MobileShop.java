package com.bridgelabz.interfacedemo;

public class MobileShop implements Shop {

	@Override
	public void getName() {
		System.out.println("Samsung j7");
	}

	@Override
	public void getPrice() {
		
		System.out.println("Rs:12000");
		
	}

}
