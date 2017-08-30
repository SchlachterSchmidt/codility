package triangle;

import java.util.Arrays;

public class Triangle {

	/*
	 * Write a function that, given a zero-indexed array A consisting of N
	 * integers, returns 1 if there exists a triangular triplet for this array
	 * and returns 0 otherwise.
	 * 
	 * https://codility.com/demo/results/trainingCQ55WE-S95/
	 */

	public int solution(int[] A) {

		int n = A.length;

		Arrays.sort(A);

		for (int i = n - 1; i >= 2; i--) {
			long p = A[i];
			long q = A[i - 1];
			long r = A[i - 2];

			if (q + r > p)
				return 1;

		}
		return 0;
	}
}
