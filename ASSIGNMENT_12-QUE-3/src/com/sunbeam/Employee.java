package com.sunbeam;

import java.util.Scanner;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;
	
	Scanner sc = new Scanner(System.in);
	
	public Employee() {
	}

	public Employee(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(int id) {
		super();
		this.id = id;
	}

	public void acceptData() {
		System.out.print("Enter Employee id - ");
		id = sc.nextInt();
		System.out.print("Enter Employee Name - ");
		name = sc.next();
		System.out.print("Enter Employee Salary- ");
		salary = sc.nextDouble();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Employee) {
			Employee e = (Employee)obj;
			return this.getId() == e.getId();
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=").append(id).append(", name=").append(name).append(", salary=").append(salary).append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Employee e1) {
		int diff = Integer.compare(this.getId(), e1.getId());
		return diff;
	}
	
}