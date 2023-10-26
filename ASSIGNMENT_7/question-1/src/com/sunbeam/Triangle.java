package com.sunbeam;
import java.math.*;
public class Triangle extends Polygon {
	double side1;
	double side2;
	double side3;

	public Triangle() {

	}

	
	public Triangle(double side1, double side2, double side3) {
	
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}


	@Override
	public double calcArea() {
		double s=(side1+side2+side3)/2;
		double area= Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}

}
