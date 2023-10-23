package que_1;
import java.util.Scanner;


public class Invoice {
private String partNumber;
private String partDescription;
private int quantity;
private double price;

Invoice()
{ this.partNumber="";
this.partDescription="";
quantity=0;
price=0;

}

public String getPartNumber() {
	return partNumber;
}

public void setPartNumber(String partNumber) {
	this.partNumber = partNumber;
}

public String getPartDescription() {
	return partDescription;
}

public void setPartDescription(String partDescription) {
	this.partDescription = partDescription;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	if(quantity<0)
		this.quantity=0;
	else
	this.quantity = quantity;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	if(price<0)
		this.price=0;
	else
	this.price = price;
}
public void accept() {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter part name");
	partDescription=sc.next();
	System.out.println("enter price");
	price=sc.nextDouble();
	System.out.println("enter quantity");
	quantity=sc.nextInt();
}
public double displayAmount()
{

return quantity*price;
}


}
