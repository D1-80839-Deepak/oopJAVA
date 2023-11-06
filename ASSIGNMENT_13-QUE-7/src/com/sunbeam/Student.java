package com.sunbeam;

import java.util.Scanner;

public class Student {
	private int roll;
	private int marks;
	private String name;
	
	// Constructors
	public Student() {
		this.roll = 0;
		this.marks = 0;
		this.name = "";
	}
	public Student(int roll, int marks, String name) {
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}
	
	// Getter Methods
	public int getRoll() {
		return roll;
	}
	public int getMarks() {
		return marks;
	}
	public String getName() {
		return name;
	}
	
	// Setter Methods
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Facilitator Method
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll No: ");
		this.roll = sc.nextInt();
		System.out.print("Enter Name: ");
		this.name = sc.next();
		System.out.print("Enter Marks: ");
		this.marks = sc.nextInt();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[Roll No: ").append(roll).append(", Name: ").append(name)
		.append(", Marks: ").append(marks).append("]");
		
		return sb.toString();
	}
	
}