package tapeequilibrium;

public class TapeEquilibrium {
	
	/*
	 * Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|
	 */
	
	public int solution(int[] A) {
		
		int leftHandSide = A[0];
		int rightHandSide = 0;

		for (int i = 0; i < A.length; i++) {
			rightHandSide += A[i];
		}
		
		int minDiff = Integer.MAX_VALUE;
		
		// at this point, rightHandSide is the sum of all elements in A
		// and minDiff is 2147483647
		
		// subtract A[i] from rightHandSide and calculate diff
		// if diff is the new minimum, update minDiff
		// adding next element to LeftHandSide and repeat
		for (int i = 0; i < A.length -1; i++) {
			rightHandSide -= A[i];
			int diff = Math.abs(rightHandSide - leftHandSide);
			if (diff < minDiff) {
				minDiff = diff;
			}
			leftHandSide +=  A[i + 1];
		}
		
		return minDiff;
	}
}
