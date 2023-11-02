package com.sunbeam;

import java.util.Scanner;

public class Book {
	String isbn;
	double price;
	String authorName;
	int quantity;

	public Book() {
	}
	

	public Book(String isbn) {
		this.isbn = isbn;
	}


	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof Book)
			{
				Book other=(Book)obj;
				if(this.isbn.equals(other.isbn))
					return true;
				return false;
			}
		}
		return false;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter isbn :");
		isbn = sc.next();
		System.out.println("enter price :");
		price = sc.nextDouble();
		System.out.println("enter Author Name :");
		authorName = sc.next();
		System.out.println("enter Quantity :");
		quantity = sc.nextInt();

	}

	public void display() {
		System.out.println("isbn :" + isbn);
		System.out.println("price :" + price);
		System.out.println("Author Name :" + authorName);
		System.out.println("Quantity :" + quantity);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
