package generic;

public class GenericClass {
public static void main(String[] args) {
		
		Integer[] arr1 = new Integer[] {10, 20, 30, 40, 50};
		Double[] arr2 = new Double[] {1.1, 2.2, 3.3, 4.4, 5.5};
		
		System.out.println("Minimun in Integer type Array - " + calcArray(arr1));
		System.out.println("Minimun in Double type Array - " + calcArray(arr2));
		
	}
	
	public static <T extends Number> double calcArray(T[] arr) {
		double val = Double.MAX_VALUE;
		
		
		for(int i = 0; i < arr.length; i++) {
			if(val > arr[i].doubleValue()) {
				val = arr[i].doubleValue();
			}
		}
		return val;
	}
}
