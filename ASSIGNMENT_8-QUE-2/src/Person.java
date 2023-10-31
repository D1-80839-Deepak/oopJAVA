import java.util.Scanner;

import exception.EmployeeException;

public class Person {
String name;
int age;
public Person() {
	
}
public Person(String name, int age) {

	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public void accept() {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter name :");
	name=sc.next();
	
	System.out.println("enter age :");
	age=sc.nextInt();
	if(age<18) throw new EmployeeException("age must be greater than 18");
	else
	setAge(age);
}
public void display() {
	System.out.println("name :"+name);
	System.out.println("age :"+age);
	
}
@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}


}
