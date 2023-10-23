package que_1;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice i1=new Invoice();
		i1.accept();
		double bill=i1.displayAmount();
		System.out.println("your total bill :"+bill);

	}

}
