package que_2;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1=new Employee("Deepak","Nikhare",1000);
		Employee e2=new Employee("Amol","Banait",2000);
		
		e1.display();
		e2.display();
		System.out.println("After Increament");
		e1.raise(10);
		e2.raise(10);
		e1.display();
		e2.display();
		
	
	}
}