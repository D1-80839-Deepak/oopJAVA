package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x coordinate for p1 :");
		int x1=sc.nextInt();
		System.out.println("enter y coordinate for p1 :");
		int y1=sc.nextInt();
		Point2D p1=new Point2D(x1,y1);
		System.out.println("enter x coordinate for p2 :");
		int x2=sc.nextInt();
		System.out.println("enter y coordinate for p2 :");
		int y2=sc.nextInt();
		Point2D p2=new Point2D(x2,y2);
		System.out.println("point p1 :"+p1.getDetails());
		System.out.println("point p1 :"+p2.getDetails());
		
		if(p1.isEqual(p2))
			System.out.println("Points are Equal");
		else {
			System.out.println("Points are not Equal");
			System.out.println("Distance between two Points :"+p1.calculateDistance(p2));
		}	
	}

}
