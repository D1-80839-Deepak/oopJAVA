
public class Employees {
	public static double averageSalLabor(Employee[] arr) {
		double avg = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=null)
			if (arr[i] instanceof Labor) {
				avg = avg + arr[i].getSalary();
				count++;
			}

		}
		return avg/count;
	}

	public static double averageSalSalesmans(Employee[] arr) {
		double avg = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=null)
			if (arr[i] instanceof Salesman) {
				avg = avg + arr[i].getSalary();
				count++;
			}

		}
		return avg/count;
	}

	public static double averageSalClerks(Employee[] arr) {
		double avg = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=null)
			if (arr[i] instanceof Clerk) {
				avg = avg + arr[i].getSalary();
				count++;
			}

		}
		return avg/count;
	}
}
