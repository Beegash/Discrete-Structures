package Week10;

import java.util.Arrays;

public class EX5 {

	public static void ftInsertionSort(int[] arr) {
		int length = arr.length;
		int j = 0;
		while (j < length) {
			int key = arr[j];
			int i = j - 1;
			while (i >= 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i -= 1;
			}
			arr[i + 1] = key;
			j++;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 3, 17, 88, 42 ,12 };
		ftInsertionSort(arr);
		System.out.println("Sorted array: " + Arrays.toString(arr));
	}
}
