package com.bridgelabz.autowiredbytype;

public class Shop {

	
	private Mobile mobile;

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
		
	}
	
	public void network() {
		if(mobile != null) {
			System.out.println("mobile calling");
			mobile.calling();
		} else {
			System.out.println("Poor network");
		}
	}
	
}
