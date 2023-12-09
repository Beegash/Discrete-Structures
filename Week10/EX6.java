package Week10;

public class EX6 {

	public static int ftBinarySearch(int[] arr, int min, int max, int key) {
		while (min <= max) {
			int middle = (max + min) / 2;

			if (arr[middle] > key) {
				max = middle - 1;
			} else if (arr[middle] < key) {
				min = middle + 1;
			} else {
				return middle;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int min = 0;
		int max = 9;
		int key = 6;

		int result = ftBinarySearch(arr, min, max, key);

		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found in the list.");
		}
	}

}
