package com.sunbeam;

public class Circle extends BoundedShape {
	private static final double PI = 3.142;
	int radius;

	public Circle() {

	}

	public Circle(int radius) {

		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return PI * this.radius * this.radius;
	}

}
