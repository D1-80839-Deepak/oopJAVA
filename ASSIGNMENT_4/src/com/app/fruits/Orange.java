package com.app.fruits;

import java.util.Scanner;

public class Orange extends Fruits{

	
	
	public Orange() {
	}

	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}
	
	@Override
	public String test() {
		return "Sour";
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}