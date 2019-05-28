package com.bridgelabz.interfacedemo;

public class ShopD {
	private Shop shop;
	
	public ShopD() {}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public ShopD(Shop shop) {
		super();
		this.shop = shop;
	}
	
	public void test()
	{
		shop.getName();
		shop.getPrice();
	}

}
