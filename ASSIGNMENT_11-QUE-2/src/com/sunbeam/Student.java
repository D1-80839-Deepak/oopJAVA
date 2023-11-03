package com.sunbeam;

import java.util.Scanner;

public class Student {
	
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	Scanner sc = new Scanner(System.in);
	
	public Student() {
	}

	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	
	public void acceptData() {
		System.out.print("Enter Roll No - ");
		roll = sc.nextInt();
		System.out.print("Enter Name - ");
		name = sc.next();
		System.out.print("Enter City - ");
		city = sc.next();
		System.out.print("Enter Marks - ");
		marks = sc.nextDouble();
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [roll=").append(roll).append(", name=").append(name).append(", city=").append(city)
				.append(", marks=").append(marks).append("]");
		return builder.toString();
	}

}