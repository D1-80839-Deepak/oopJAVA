package com.sunbeam;

import java.util.Scanner;

public class Album extends Product {
String singer;
String musician;
public Album() {
	super();
}
public Album(String title, double price,String singer, String musician) {
	super(title,price);
	this.singer = singer;
	this.musician = musician;
}
public void accept() {
	super.accept();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter singer name");
	singer=sc.next();
	System.out.println("enter musician name");
	musician=sc.next();
}
public String getSinger() {
	return singer;
}
public void setSinger(String singer) {
	this.singer = singer;
}
public String getMusician() {
	return musician;
}
public void setMusician(String musician) {
	this.musician = musician;
}
public double calculatePrice() {
	return 1.1*price;
}
@Override
public String toString() {
	return "Album [singer=" + singer + ", musician=" + musician + ", title=" + title + ", price="  + "]";
}



}
