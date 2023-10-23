import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number :");
		int num=sc.nextInt();
		System.out.println("number in Binary :"+Integer.toBinaryString(num));
		System.out.println("number in Octal :"+Integer.toOctalString(num));
		System.out.println("number in Hexadecimal :"+Integer.toHexString(num));
		

	}

}
