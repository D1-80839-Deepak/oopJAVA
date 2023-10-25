package tester;

import java.util.Scanner;

import com.app.geometry.*;

public class TestPointArray1 {
	public static int menu() {
		System.out.println("enter choice");
		System.out.println("1.show points at specific index");
		System.out.println("2.display all points");
		System.out.println("3.validate the points");
		System.out.println("0.exit");
		int choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Point2D p=new Point2D();
		System.out.println("enter number of points  ");
		int size = new Scanner(System.in).nextInt();
		Point2D[] points = new Point2D[size];

		for (int i = 0; i < size; i++) {
			points[i] = new Point2D();
			points[i].accept();
		}
		int choice;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				System.out.println("enter index");
				int index = new Scanner(System.in).nextInt();
				
				
				System.out.println("point :"+points[index].getDetails());
				break;
			case 2:
				for (int i = 0; i < size; i++)
					
				System.out.println("points are "+points[i].getDetails());

				break;
			case 3:
				System.out.println("enter two index of points");
				int indx1=new Scanner(System.in).nextInt();
				int indx2=new Scanner(System.in).nextInt();
				if(p.issEqual(points[indx1], points[indx2]))
				System.out.println("points are equal");
				else
					System.out.println("disstance between two points :"+p.calculateDistance(points[indx1], points[indx2]));
				break;

			default:
				System.out.println("wrong choice");
				break;
			}
		}

	}

}
