package com.sunbeam;

public class Rectangle extends Polygon{
int length;
int breadth;
public Rectangle(int length, int breadth) {
	this.length = length;
	this.breadth = breadth;
}
public Rectangle() {
}
@Override
	public double calcArea() {
		return length * breadth;
	}



	

}
