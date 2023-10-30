import java.util.Iterator;

public class question2 {

	public static void main(String[] args) {
		String str = "Bank Of Maharastra";
		String[] arr = str.split(" ");
		for (String element : arr)
			System.out.print(element.substring(0, 1));
		System.out.println();

		System.out.println("--------------------------");

		String str1 = "this is string";
		String[] arr1 = str1.split(" ");
		for (String element : arr1)
			System.out.print(element.substring(0, 1).toUpperCase() + element.substring(1) + " ");
		System.out.println();
		System.out.println("----------------------------");

		String str2 = "Example";
		for (int i = 0; i < str2.length(); i++) {
			if (i % 2 != 0)
				System.out.print(str2.substring(i, i + 1).toUpperCase());
			else
				System.out.print(str2.substring(i, i + 1).toLowerCase());

		}
		System.out.println();
		System.out.println("-------------------------------");
		String str4="in";
		StringBuilder str3=new StringBuilder("www.sunbeaminfo.com");
		System.out.println(str3.replace(16, 19, str4));

	}

}
