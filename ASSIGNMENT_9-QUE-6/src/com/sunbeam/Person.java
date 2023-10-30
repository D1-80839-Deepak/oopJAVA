package com.sunbeam;

import java.util.Scanner;
enum Gender {
	MALE, FEMALE
}

public class Person {
String name;
int age;
Gender gender;
public Person() {
}
public Person(String name, int age, Gender gender) {
	this.name = name;
	this.age = age;
	this.gender = gender;
}
public void acceptData() {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter name");
	name=sc.next();
	System.out.println("enter age");
	age=sc.nextInt();
	System.out.println("enter gender : MALE/FEMALE");
	gender=Gender.valueOf(sc.next().toUpperCase());
}
public void displayData() {
	System.out.println("name :"+name);
	System.out.println("Age :"+age);
	System.out.println("Gender :"+gender);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
