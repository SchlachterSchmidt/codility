package prefixsums.passingcars;

public class PassingCars {

	/*
	 * A non-empty zero-indexed array A consisting of N integers is given. The
	 * consecutive elements of array A represent consecutive cars on a road.
	 * 
	 * Array A contains only 0s and/or 1s: - 0 represents a car traveling east,
	 * - 1 represents a car traveling west.
	 * 
	 * The goal is to count passing cars. We say that a pair of cars (P, Q),
	 * where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is
	 * traveling to the west.
	 */

	public int solution(int[] A) {

		int n = A.length, 
			prefix = 0,
			passes = 0;
		
		int[] prefixSums = new int[n];

		for (int i = 0; i < n; i++) {

			prefixSums[i] = A[i] + prefix;
			prefix = prefixSums[i];
		}
		
		for (int i = 0; i < n; i++) {
			if (A[i] == 0) {
				passes += prefixSums[n - 1] - prefixSums[i];
				if (passes > 1000000000) return -1;
			}
		}

		return passes;
	}
}
