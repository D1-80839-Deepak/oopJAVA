package com.app.fruits;

import java.util.Scanner;

public class Mango extends Fruits{

	
	
	public Mango() {
	}

	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}
	
	@Override
	public String test() {
		return "Sweet";
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
