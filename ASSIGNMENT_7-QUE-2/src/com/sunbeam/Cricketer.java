package com.sunbeam;

import java.util.Scanner;

public class Cricketer extends Player implements Batter,Bowler {
int runs;
int wickets;

public Cricketer() {
	
}



public Cricketer(int id, String name, int age, int matchesPlyaed,int runs,int wickets) {
	super(id, name, age, matchesPlyaed);
	this.runs=runs;
	this.wickets=wickets;
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

public void setRuns(int runs) {
	this.runs = runs;
}



public void setWickets(int wickets) {
	this.wickets = wickets;
}



@Override
public int getWickets() {
	
	return wickets;
}
@Override
public double getEcconomy() {
	
	return runs/wickets;
}
@Override
public int getRuns() {
	
	return runs;
}
@Override
public double getAverage() {
	
	return runs/matchesPlyaed;
}
@Override
public double getStrikeRate() {
	
	return (runs/matchesPlyaed)*100;
}
@Override
	public String toString() {
		return super.toString()+" Runs :"+runs+" Wickets :"+wickets;
	}
}
