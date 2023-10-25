import java.util.Scanner;

public class Customers {
int acc_no;
int pendingBalance;
int totalItemsCharged;
int totalCreditsApplied;
int allowedCreditLimit;


public void accept() {
	System.out.println("enter account number :");
	acc_no=new Scanner(System.in).nextInt();
	
	System.out.println("enter pending balance at the beginning of the month :");
	pendingBalance=new Scanner(System.in).nextInt();
	
	System.out.println("enter total of all items charged by the customer this month:");
	totalItemsCharged=new Scanner(System.in).nextInt();
	
	System.out.println("enter atotal of all credits applied to the customer’s account this month:");
	totalCreditsApplied=new Scanner(System.in).nextInt();
	
	System.out.println("enter allowed credit limit :");
	allowedCreditLimit=new Scanner(System.in).nextInt();
	
}
public int calculateNewBalance() {
	return pendingBalance+totalItemsCharged-totalCreditsApplied;
}

public static void main(String[]args) {
	Customers c1=new Customers();
	c1.accept();
	System.out.println("your new balance for next month :"+c1.calculateNewBalance());
	if(c1.calculateNewBalance()>c1.allowedCreditLimit)
		System.out.println("Credit Limit Exceed");
}
}
