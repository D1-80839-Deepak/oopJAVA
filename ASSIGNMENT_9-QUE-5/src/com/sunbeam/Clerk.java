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
	public String toString() {
		return String.format("id =%d salary =%f name =%s age =%d\n",this.id,this.salary,this.name,this.age);
	}
	
}
