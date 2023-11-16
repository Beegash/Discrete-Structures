import java.util.Arrays;

public class quiz {
	public static int[] complement(char[] U, char[] A, char[] B) {
		int[] result = new int[U.length];
		for (int i = 0; i < U.length; i++) {
			boolean inA = false;
			boolean inB = false;
			for (int j = 0; j < A.length; j++) {
				if (U[i] == A[j]) {
					inA = true;
					break;
				}
			}
			for (int j = 0; j < B.length; j++) {
				if (U[i] == B[j]) {
					inB = true;
					break;
				}
			}
			result[i] = (inA || inB) ? 0 : 1;
		}
		return result;
	}
	public static void main(String[] args) {
		char[] U = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		char[] A = {'b', 'd', 'g', 'h'};
		char[] B = {'a', 'b', 'g'};
		int[] result = complement(U, A, B);
		System.out.println("U: " + Arrays.toString(U));
		System.out.println("A: " + Arrays.toString(A));
		System.out.println("B: " + Arrays.toString(B));
		System.out.println("A' U B': " + Arrays.toString(result));
	}
}