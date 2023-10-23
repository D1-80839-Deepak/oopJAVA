import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int choice;
		int quantity;
		int dosa=40;
		int samosa=40;
		int idli=50;
		int poha=40;
		int wada=40;
		do {
			
			System.out.println("Select Menu :");
			System.out.println("0. Exit");
			System.out.println("1. Dosa-- 40 rs.");
			System.out.println("2. Samosa-- 40 rs. ");
			System.out.println("3. idli-- 50 rs.");
			System.out.println("4. Poha-- 40 rs.");
			System.out.println("5. Wada-- 40 rs.");
			System.out.println("6. Generate Bill ");
			
			
			choice = sc.nextInt();
			 switch (choice) {
			case 1:
				System.out.println("enter quantity :");
				quantity = sc.nextInt();
				sum = sum+quantity*dosa;
				System.out.println(quantity+" dosa added");
				System.out.println();
				
				break;
			case 2:
				System.out.println("enter quantity :");
				quantity = sc.nextInt();
				sum = sum+quantity*samosa;
				System.out.println(quantity+" samosa added");
				System.out.println();
				break;
			case 3:
				System.out.println("enter quantity :");
				quantity = sc.nextInt();
				sum = sum+quantity*idli;
				System.out.println(quantity+" idli added");
				System.out.println();
				break;
			case 4:
				System.out.println("enter quantity :");
				quantity = sc.nextInt();
				sum = sum+quantity*poha;
				System.out.println(quantity+" poha added");
				System.out.println();
				break;
			case 5:
				System.out.println("enter quantity :");
				quantity = sc.nextInt();
				sum = sum+quantity*wada;
				System.out.println(quantity+" wada added");
				System.out.println();
				break;
			case 6:
				
				System.out.println("Your Total bill :"+sum);
				break;


			default:
				break;
			}
			
			
			
		} while (choice!=0);
		

	}

}
