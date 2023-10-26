package com.sunbeam;

import java.util.Scanner;

public class Cricketer extends Player implements Batter,Bowler {
int runs;
int wickets;

public Cricketer() {
	
}
public Cricketer(int runs, int wickets) {
	
	this.runs = runs;
	this.wickets = wickets;
}
@Override
	public void accept() {
		super.accept();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter runs :");
		runs=sc.nextInt();
		System.out.println("enter wickets :");
		wickets=sc.nextInt();
	}
@Override
	public void display() {
		super.display();
		System.out.println("Runs :"+runs);
		System.out.println("Wickets :"+wickets);
	}
@Override
public int getWickets() {
	
	return 0;
}
@Override
public double getEcconomy() {
	
	return 0;
}
@Override
public int getRuns() {
	
	return 0;
}
@Override
public double getAverage() {
	
	return 0;
}
@Override
public double getStrikeRate() {
	
	return 0;
}
@Override
	public String toString() {
		return super.toString()+" Runs :"+runs+" Wickets :"+wickets;
	}
}
