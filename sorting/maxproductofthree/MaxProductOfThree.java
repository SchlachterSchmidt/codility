package sorting.maxproductofthree;

import java.util.Arrays;

public class MaxProductOfThree {
	
	/*
	 * Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).
	 * 
	 * https://codility.com/demo/results/trainingWMZZJZ-CGW/
	 */
	
	public int solution(int[] A) {
		
		int n = A.length;
		Arrays.sort(A);
		
		long p = A[n - 1];
		long q = A[n - 2];
		long r = A[n - 3];
		long i = A[0];
		long j = A[1];

		return (int)Math.max((p * q * r), (p * i * j));
	}
}
