import java.util.Scanner;

public class DrivingCost {
	int milesPerDay;
	int costPerGallon;
	double average;
	int parkingFees;
	int tollPerDay;
	
	public void accept() {
		System.out.println("enter total miles driven per day");
		milesPerDay=new Scanner(System.in).nextInt();
		System.out.println("enter cost per gallon of gasoline");
		costPerGallon=new Scanner(System.in).nextInt();
		System.out.println("enter average odf car");
		average=new Scanner(System.in).nextInt();
		System.out.println("enter parking fees per day");
		parkingFees=new Scanner(System.in).nextInt();
		System.out.println("enter toll rs per day");
		tollPerDay=new Scanner(System.in).nextInt();
		
	}
	public double totalCost() {
	return ((milesPerDay/average)*costPerGallon)+parkingFees+tollPerDay;	
		
	}
	public void carPooling() {
		System.out.println("enter no of person to share");
		int person=new Scanner(System.in).nextInt();
		double cost= totalCost()/person;
		System.out.println("after sharing, the money saved per person :"+(totalCost()-cost));
		
	}

	public static void main(String[] args) {
		DrivingCost d= new DrivingCost();
		d.accept();
		System.out.println("your total cost :"+d.totalCost());
		d.carPooling();

	}

}
