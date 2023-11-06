package com.sunbeam.helper;

public interface Employee {
	
	double getSal();
	
	default double calcIncentives() {
		return 0.0;
	}
	
	static double calcTotalIncome(Employee[] arr) {
		double totalIncome = 0.0;
		
		for (Employee emp:arr)
			totalIncome += emp.getSal() + emp.calcIncentives();
		
		return totalIncome;
	}
}
