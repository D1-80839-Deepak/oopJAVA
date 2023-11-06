package com.sunbeam.office;

import com.sunbeam.helper.Employee;

public class Labour implements Employee {
	private double hours;
	private double rate;
	
	// Constructors
	public Labour() {
		this.hours = 0.0;
		this.rate = 0.0;
	}
	public Labour(double hours, double rate) {
		this.hours = hours;
		this.rate = rate;
	}
	
	// Getter Methods
	public double getHours() {
		return hours;
	}
	public double getRate() {
		return rate;
	}
	
	// Setter Methods
	public void setHours(double hours) {
		this.hours = hours;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	// Super-interface methods
	@Override
	public double getSal() {
		return hours * rate;
	}
	@Override
	public double calcIncentives() {
		if (hours > 300)
			return this.getSal() * 0.05;
		
		return 0.0;
	}
	@Override
	public String toString() {
		return "Labor [Hours = " + hours + ", Rate = " + rate + 
				", Total Salary = " + this.getSal() + ", Incentives = " 
				+ this.calcIncentives() + "]";
	}
	
}