package com.sunbeam;

import java.util.Scanner;

public class Toy extends Product{
String ageGroup;
String type;
public Toy() {
	super();
}
public Toy(String title, double price,String ageGroup, String type) {
	super(title,price);
	this.ageGroup = ageGroup;
	this.type = type;
}
public void accept() {
	super.accept();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter age group");
	ageGroup=sc.next();
	System.out.println("enter type");
	type=sc.next();
}
public String getAgeGroup() {
	return ageGroup;
}
public void setAgeGroup(String ageGroup) {
	this.ageGroup = ageGroup;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double calculatePrice() {
	return 1.05*price;
}
@Override
public String toString() {
	return "Toy [ageGroup=" + ageGroup + ", type=" + type + ", title=" + title + ", price=" + price*1.05 + "]";
}

}
