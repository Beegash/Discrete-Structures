package Week10;

public class EX3 {

	public static int ftLinearSearch(int x, int[] arr) {
		int length = arr.length;
		int i = 1;
		int location = 0;

		while (i <= length && x != arr[i - 1]) {
			i++;
		}

		if (i <= length) {
			location = i;
		} else {
			location = 0;
		}

		return location;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int target = 1;
		int location = ftLinearSearch(target, array);

		if (location == 0) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Element found at index " + location);
		}
	}

}
