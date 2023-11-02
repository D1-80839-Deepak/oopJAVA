package com.sunbeam;

import java.util.Scanner;


public abstract class  Employee extends Person{
	int id;
	double salary;
	
	
	public Employee() {
	}

	public Employee(int id, double salary) {
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void accept() {
		super.accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		id=sc.nextInt();
		if(id<=0) throw new EmployeeException("id must be greater than zero");
		else 
			setId(id);
		System.out.println("enter salary");
		salary=sc.nextDouble();
		if(salary<=0) throw new EmployeeException("salary not be zero");
		else
			setSalary(salary);
	}
	public void display() {
		super.display();
		System.out.println("id :"+id);
		System.out.println("salary :"+salary);
	}

	abstract public double calcSalary();

}