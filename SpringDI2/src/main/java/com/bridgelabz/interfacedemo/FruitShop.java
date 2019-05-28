package com.bridgelabz.interfacedemo;

public class FruitShop implements Shop{


	@Override
	public void getName() {
	System.out.println("Apple fruit");
	}

	@Override
	public void getPrice() {
	System.out.println("Rs : 80");
		
	}

}
