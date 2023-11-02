package com.sunbeam;

import java.util.Comparator;
import java.util.Scanner;

public class Book implements Comparable<Book>{
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	Scanner sc = new Scanner(System.in);
	
	public Book() {
	}

	public Book(String isbn)
	{
		this.isbn=isbn;
	}
	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public void accept() {
		
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		
		System.out.print("Enter ISBN Number - ");
		isbn = sc.next();
		System.out.print("Enter Book Price - ");
		price = sc.nextInt();
		System.out.print("Enter Author Name - ");
		authorName = sc.next();
		System.out.print("Enter Quantity - ");
		quantity = sc.nextInt();
	}
	
	public String getIsbn() {
		return isbn;
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
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(this == obj) {
			return true;
		}
		if(obj instanceof Book) {
			Book book = (Book)obj;
			if(this.isbn.equals(book.isbn)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

	@Override
	public int compareTo(Book b) {
		int diff = this.getIsbn().compareTo(b.getIsbn());
		return diff;
	}
	
}