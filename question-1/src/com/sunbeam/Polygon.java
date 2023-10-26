package com.sunbeam;

abstract public class Polygon extends BoundedShape {
	int numOfSide;

	public Polygon() {

	}

	public Polygon(int numOfSide) {
		this.numOfSide = numOfSide;
	}

	@Override
	public double calcArea() {

		return 0;
	}

}
