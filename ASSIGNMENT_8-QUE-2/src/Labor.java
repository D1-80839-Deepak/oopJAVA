import java.util.Scanner;

public class Labor extends Employee {

	int rate;
	int hours;

	

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
//
//	public void accept() {
//		super.accept();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter rate :");
//		rate = sc.nextInt();
//		System.out.println("enter hours :");
//		hours = sc.nextInt();
//
//	}
	@Override
	public void accept() {
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rate :");
		rate = sc.nextInt();
		System.out.println("enter hours :");
		hours = sc.nextInt();

	}
	public void display() {
		super.display();
		System.out.println("rate :"+rate);
		System.out.println("hours :"+hours);
	}

	@Override
	public double calcSalary() {
		double salary = this.hours * this.rate;
		return salary;
	}

}
