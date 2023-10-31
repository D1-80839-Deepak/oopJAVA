import java.util.Scanner;

import exception.EmployeeException;

public class Test {

	public static void main(String[] args) {
		Employee[] arr = new Employee[3];

		int choice;
		int index = -1;

		do {
			System.out.println("0. exit");
			System.out.println("1. Add Labor");
			System.out.println("2. Add Salesman");
			System.out.println("3. Add Clerk");
			System.out.println("4. Display Employee");
			System.out.println("5. Display average sal of labor");
			System.out.println("6. Display average sal of Salesman");
			System.out.println("7. Display average sal of Clerk");
			System.out.println("select choice");
			
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				index++;
				arr[index] = new Labor();
				try {
					
					arr[index].accept();
					
				} catch (EmployeeException e) {

					System.out.println(e.getInvalidValue());
					index--;
				}

				break;
			case 2:
				index++;
				arr[index] = new Salesman();
				try {
					
					arr[index].accept();
					
				} catch (EmployeeException e) {

					System.out.println(e.getInvalidValue());
					index--;
				}
				break;
			case 3:
				index++;
				arr[index] = new Clerk();
				try {
				
					arr[index].accept();
					
				} catch (EmployeeException e) {

					System.out.println(e.getInvalidValue());
					index--;
				}
				break;
			case 4:
//				for(Employee emp:arr)
//					System.out.println(emp);
				for (int i = 0; i <= index; i++) {
					arr[i].display();
				}

				break;
			case 5:
				System.out.println("average salary of Labour :"+Employees.averageSalLabor(arr));
				break;
			case 6:
				System.out.println("average salary of Salesman :"+Employees.averageSalSalesmans(arr));
				break;
			case 7:
				System.out.println("average salary of Clerk :"+Employees.averageSalClerks(arr));
				break;

			default:
				break;
			}

		} while (choice != 0);

	}

}
