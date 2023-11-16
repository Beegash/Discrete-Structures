
import java.util.Arrays;

public class test {
	public static void main(String[] args) {

		Integer[] set1 = {1, 2, 3, 4, 5};
		Integer[] set2 = {4, 5, 6, 7, 8};
		Integer[] union = new Integer[set1.length + set2.length];
		int i = 0;
		for (Integer element : set1) {
			union[i++] = element;
		}
		for (Integer element : set2) {
			if (!Arrays.asList(set1).contains(element)) {
				union[i++] = element;
			}
		}
		Integer[] intersection = new Integer[Math.min(set1.length, set2.length)];
		int j = 0;
		for (Integer element : set1) {
			if (Arrays.asList(set2).contains(element)) {
				intersection[j++] = element;
			}
		}
		System.out.println("Set A: " + Arrays.toString(set1));
		System.out.println("Set B: " + Arrays.toString(set2));
		System.out.println("Union: " + Arrays.toString(Arrays.copyOf(union, i)));
		System.out.println("Intersection: " + Arrays.toString(Arrays.copyOf(intersection, j)));
	}
}
