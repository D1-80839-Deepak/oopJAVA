package com.app.fruits;

import java.util.Scanner;

abstract public class Fruits {
	String color;
	double weight;
	String name;
	boolean isFresh;
	
	public Fruits() {
	}

	public Fruits(String color, double weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	public String test() {
		return "no specific test";
	}

	@Override
	public String toString() {
		return "Fruits [color=" + color + ", weight=" + weight + ", name=" + name + ", " + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}	
	
	
	
}