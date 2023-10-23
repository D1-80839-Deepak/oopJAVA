import java.util.Scanner;

public class question2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first double value: ");
        if (sc.hasNextDouble()) {
            double num1 = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter the second double value: ");
            if (sc.hasNextDouble()) {
                double num2 = sc.nextDouble();
                sc.close();
                double average = (num1 + num2) / 2;
                System.out.println("Average of " + num1 + " and " + num2 + " is: " + average);
            } else {
                System.out.println("Error: Second input is not double.");
            }
        } else {
            System.out.println("Error: First input is not double.");
        }
    }
}

