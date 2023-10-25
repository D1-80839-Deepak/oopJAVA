package com.app.geometry;

import java.util.Scanner;

public class Point2D {

	int x_cord;
	int y_cord;

	public Point2D() {
		this.x_cord = 0;
		this.y_cord = 0;
	}

	public String getDetails() {
		return "(" + x_cord + "," + y_cord + ")";
	}

	public boolean isEqual(Point2D other) {
		return (this.x_cord == other.x_cord) && (this.y_cord == other.y_cord);

	}
	public boolean issEqual(Point2D first,Point2D second) {
		return (first.x_cord == second.x_cord) && (first.y_cord == second.y_cord);

	}
	public void accept() {
		System.out.println("enter x cordinate");
		x_cord=new Scanner(System.in).nextInt();
		
		System.out.println("enter y cordinate");
		y_cord=new Scanner(System.in).nextInt();
	}


	public double calculateDistance(Point2D first,Point2D second) {
		int dist_x = first.x_cord - second.x_cord;
		int dist_y = first.y_cord - second.y_cord;
		double sqrX = Math.pow(dist_x, 2);
		double sqrY = Math.pow(dist_y, 2);
		double add = sqrX + sqrY;
		return Math.sqrt(add);

	}

}
