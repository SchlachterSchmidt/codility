package minavgtwoslice;

public class MinAvgTwoSlice {

	/*
	 * A non-empty zero-indexed array A consisting of N integers is given. A
	 * pair of integers (P, Q), such that 0 ≤ P < Q < N, is called a slice of
	 * array A (notice that the slice contains at least two elements). The
	 * average of a slice (P, Q) is the sum of A[P] + A[P + 1] + ... + A[Q]
	 * divided by the length of the slice. To be precise, the average equals
	 * 
	 * (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1).
	 * 
	 * 
	 * https://codility.com/demo/results/trainingQBWNJ7-6C4/
	 */

	public int solution(int[] A) {

		int n = A.length;
		int minIdx = 0;
		double minAvg = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (i + 1 < n) {
				double curAvg = (double)(A[i] + A[i + 1]) / 2;
				if (curAvg < minAvg) {
					minAvg = curAvg;
					minIdx = i;
				}
			}
			if (i + 2 < n)  {
				double curAvg = (double)(A[i] + A[i + 1] + A[i + 2]) / 3;
				if (curAvg < minAvg) {
					minAvg = curAvg;
					minIdx = i;
				}
			}
		}
		return minIdx;
	}
}
