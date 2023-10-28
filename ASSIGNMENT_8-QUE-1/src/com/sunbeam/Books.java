package com.sunbeam;

import java.util.Scanner;

public class Books extends Product{
	String isbn;
	String author;
	String subject;
	public Books() {
		super();
	}
	public Books(String title, double price,String isbn, String author, String subject) {
		super(title,price);
		this.isbn = isbn;
		this.author = author;
		this.subject = subject;
	}
	public void accept() {
		super.accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter author name");
		author=sc.next();
		System.out.println("enter subject name");
		subject=sc.next();
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "Books [isbn=" + isbn + ", author=" + author + ", subject=" + subject + ", title=" + title + ", price="
				+ price + "]";
	}
	
	
	
	
}