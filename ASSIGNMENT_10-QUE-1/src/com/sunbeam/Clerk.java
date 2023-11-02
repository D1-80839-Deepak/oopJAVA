package com.sunbeam;

public class Clerk extends Employee {
	
	public void accept() {
		super.accept();
	}
	public void display() {
		super.display();
	}

	@Override
	public double calcSalary() {
double sal= salary;
		return sal;
	}
}