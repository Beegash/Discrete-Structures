package Week10;

public class EX4 {

	public static void ftBubbleSort(int[] arr) {
		int length = arr.length;
		int i = 0;

		while (i < length - 1) {
			int j = 0;
			while (j < length - i - 1) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
				j++;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 3, 17, 88 };

		ftBubbleSort(arr);
		System.out.println("Sorted array:");
		int i = 0;
		while (i < arr.length) {
			System.out.print(arr[i] + " ");
			i++;
		}
	}
}