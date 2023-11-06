package com.sunbeam.office;

import com.sunbeam.helper.Employee;

public class Clerk implements Employee {
	private double salary;

	// Constructors
	public Clerk() {
		this.salary = 0.0;
	}
	public Clerk(double salary) {
		this.salary = salary;
	}
	
	// Getter and Setter Methods
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public double getSal() {
		return this.salary;
	}
	
	@Override
	public String toString() {
		return "Clerk [Salary = " + salary + "]";
	}
	

}
