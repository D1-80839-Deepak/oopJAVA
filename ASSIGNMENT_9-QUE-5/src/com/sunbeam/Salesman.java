package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee{
	
	int target;
	double commission;
	
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public void accept() {
		super.accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter target :");
		target=sc.nextInt();
		System.out.println("enter commision :");
		commission=sc.nextDouble();
	}
	public void display() {
		super.display();
		System.out.println("target :"+target);
		System.out.println("commission :"+commission);
	}
	@Override
	public double calcSalary() {
	double sal= salary+this.commission;
		return 0;
	}
	public String toString() {
		return String.format("target =%d  commission = %d \n",this.target,this.commission);
	}
	
	

}
