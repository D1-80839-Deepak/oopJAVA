package com.sunbeam.tester;

import com.sunbeam.BoundedShape;
import com.sunbeam.Circle;
import com.sunbeam.Polygon;
import com.sunbeam.Rectangle;
import com.sunbeam.Square;
import com.sunbeam.Triangle;

public class Test {

	public static void main(String[] args) {
		Polygon square = new Square(4);
		System.out.println("area of square :"+square.calcArea());
		Polygon triangle = new Triangle(2, 3, 4);
		System.out.println("area of triangle :"+triangle.calcArea());
		Polygon rectangle = new Rectangle(3, 4);
		System.out.println("area of rectangle :"+rectangle.calcArea());

		BoundedShape circle = new Circle(3);
		System.out.println("area of circle :"+circle.calcArea());

	}

}
