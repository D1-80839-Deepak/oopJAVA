package com.sunbeam;

import java.util.Scanner;

public class Product {
	String title;
	double price;

	public Product() {

	}

	public Product(String title, double price) {

		this.title = title;
		this.price = price;
	}
public void accept() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter title");
	title=sc.next();
	System.out.println("enter price");
	price=sc.nextDouble();
}
}
