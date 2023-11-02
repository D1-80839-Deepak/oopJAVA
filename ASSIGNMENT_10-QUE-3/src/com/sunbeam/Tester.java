package com.sunbeam;

import com.sunbeam.generic.Box;
import com.sunbeam.interfaces.Displayable;


public class Tester {
	public static void printDisplayableBox(Box b) {
		b.get().display();
	}
	
	public static void printAnyBox(Box b) {
		System.out.println(b.get().toString());
	}
	public static void main(String[] args) {
		
		Box<Person> box1 = new Box<Person>();
		box1.set(new Person("abc", 20));
		Box.printDisplayableBox(box1);
		
		Box<Book> box2 = new Box<Book>();
		box2.set(new Book("Sunbeam", 100));
		Box.printDisplayableBox(box2);

	}

}
