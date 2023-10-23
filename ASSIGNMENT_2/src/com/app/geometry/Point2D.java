package com.app.geometry;
     			//QUESTION 4

public class Point2D {
int x_cord;
int y_cord;

public Point2D(int x_cord, int y_cord) {
	this.x_cord = x_cord;
	this.y_cord = y_cord;
}
public String getDetails() {
	return "("+x_cord+","+y_cord+")";
}			
public boolean isEqual(Point2D other) {
	return (this.x_cord==other.x_cord)&&(this.y_cord==other.y_cord);
	
}
public double calculateDistance(Point2D other) {
	int dist_x=this.x_cord - other.x_cord;
	int dist_y=this.y_cord - other.y_cord;
	double sqrX = Math.pow(dist_x, 2);
	double sqrY = Math.pow(dist_y, 2);
	double add=sqrX+sqrY;
	return Math.sqrt(add);
	
}
}
