package com.bridgelabz.autowiredbyname;

public class MathPoint {

	private Point pointA;

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void draw() {
		if (pointA != null) {
			pointA.drawPoint();
		} else {
			System.out.println("Not working....");
		}
	}

}
