package que_2;

import java.util.Scanner;

public class Employee {
String firstName;
String lastName;
double salary;

public Employee(String firstName, String lastName, double salary) {
	this.firstName = firstName;
	this.lastName = lastName;
	if(salary<0)
		this.salary=0.0;
	else	
	this.salary = salary;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	if(salary<0)
		this.salary=0.0;
	else
	this.salary = salary;
}
public void accept() {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter first name :");
	firstName=sc.next();
	System.out.println("enter last name");
	lastName=sc.next();
	System.out.println("enter salary");
	salary=sc.nextDouble();
}
public void display() {
	System.out.println("yearly salary of "+this.firstName+" "+this.lastName+" :"+salary*12);
}
public void raise(double percent) {
	if(percent>0)
		this.salary*=(1+percent/100);
}
}

