package com.app.fruits;

import java.util.Scanner;

public class Apple extends Fruits{

	
	
	public Apple() {
	}

	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}
	
	@Override
	public String test() {
		return "Sweet n Sour";
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}