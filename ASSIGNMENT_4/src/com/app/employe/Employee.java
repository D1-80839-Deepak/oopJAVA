package com.app.employe;


import java.util.Scanner;

abstract public class Employee {
	String firstName;
	String lastName;
	int ssn;
	
	Scanner sc = new Scanner(System.in);
	
	public Employee() {
	}

	public Employee(String firstName, String lastName, int ssn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	
	public void acceptData() {
		System.out.print("Enter first name - ");
		firstName = sc.next();
		System.out.print("Enter last name - ");
		lastName = sc.next();
		System.out.print("Enter Social security number - ");
		ssn = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + ", sc=" + sc + "]";
	}
	
	public abstract void payrollCalculation();
	
	
}