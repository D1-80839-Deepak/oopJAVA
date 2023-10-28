package com.sunbeam;

import java.util.Scanner;

abstract public class Player {
	int id;
	String name;
	int age;
	int matchesPlyaed;

	public Player() {

	}

	public Player(int id, String name, int age, int matchesPlyaed) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.matchesPlyaed = matchesPlyaed;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getMatchesPlyaed() {
		return matchesPlyaed;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id :");
		id = sc.nextInt();
		System.out.println("enter name :");
		name = sc.next();
		System.out.println("enter age :");
		age = sc.nextInt();
		System.out.println("enter matches played by player :");
		matchesPlyaed = sc.nextInt();

	}

	public void display() {
		System.out.println("Id :" + id);
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("Match Played :" + matchesPlyaed);

	}

	@Override
	public String toString() {
		return "Id :" + id + " Name :" + name + " Age :" + age + " Matches Played" + matchesPlyaed;
	}
}
