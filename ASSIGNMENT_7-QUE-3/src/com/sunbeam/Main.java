package com.sunbeam;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person person = new Person(25, 77.00, "Deepak", new Date(30, 11, 1999));
		Person p = (Person) person.clone();
		System.out.println(p.toString());
		System.out.println("-------------------------------------------------------------");
		Person p2 = (Person) person.clone();
		System.out.println(p2.toString());
		p2.setWeight(90);
		p2.getDob().setMonth(03);
		System.out.println("-------------------------------------------------------------");
		System.out.println(p2);
	}
}
