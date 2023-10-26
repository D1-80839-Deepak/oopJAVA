package com.app.employe;

public class BaseCommEmployee extends Employee{

	double grossSale;
	double commRate;
	double baseSalary;
	
	public BaseCommEmployee() {
	}
	
	public BaseCommEmployee(String firstName, String lastName, int ssn) {
		super(firstName, lastName, ssn);
	}
	
	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter gross sale - ");
		grossSale = sc.nextDouble();
		System.out.print("Enter commision rate - ");
		commRate = sc.nextDouble();
		System.out.print("Enter base salary - ");
		baseSalary = sc.nextDouble();
	}
	
	public void printSalary() {
		System.out.println("After adding 10% Commision on Base salary - " + (grossSale*commRate) + (baseSalary*0.10));
	}


	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void payrollCalculation() {
		System.out.println("Total Salary - " + (grossSale * commRate + baseSalary));
	}
	
}
