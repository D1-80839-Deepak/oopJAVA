package com.sunbeam;

public class Square extends Polygon{
int side;

public Square(int side) {
	this.side = side;
}

public Square() {
}
@Override
	public double calcArea() {
		return side*side;
	}
	

}
