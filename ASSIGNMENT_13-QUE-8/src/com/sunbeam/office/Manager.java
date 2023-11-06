package com.sunbeam.office;

import com.sunbeam.helper.*;

public class Manager implements Employee {
	private double basicSalary;
	private double dearanceAllowance;
	
	// Constructors
	public Manager() {
		this.basicSalary = 0.0;
		this.dearanceAllowance = 0.0;
	}
	public Manager(double basicSalary, double dearanceAllowance) {
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}
	
	// Getter Methods
	public double getBasicSalary() {
		return basicSalary;
	}
	public double getDearanceAllowance() {
		return dearanceAllowance;
	}
	
	// Setter Methods
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}
	
	// Super-interface methods
	@Override
	public double getSal() {
		return basicSalary + dearanceAllowance;
	}
	@Override
	public double calcIncentives() {
		return basicSalary * 0.20;
	}
	
	@Override
	public String toString() {
		return "Manager [Basic Sal = " + basicSalary + ", Allowance = " 
				+ dearanceAllowance + ", Total Salary = " + this.getSal() 
				+ ", Incentives = " + this.calcIncentives() + "]";
	}
	
}
