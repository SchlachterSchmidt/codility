package numberofdiscintersections;

import java.util.Arrays;

public class NumberOfDiscIntersections {
	
	/*
	 * Compute the number of intersections in a sequence of discs.
	 * 
	 * https://codility.com/demo/results/trainingQBWMAU-T6Y/
	 */

	public int solution(int[] A) {
		
		int n = A.length;
		long[] leftEdge = new long[n];
		long[] rightEdge = new long[n];
		
		for (int i = 0; i < n; i++) {
			leftEdge[i] = (long)i - A[i];
			rightEdge[i] = (long)i + A[i];
		}
		
		Arrays.sort(leftEdge);
		Arrays.sort(rightEdge);
		
		int currentLeft = 0;
		int counter = 0;
		for (int currentRight = 0; currentRight < n; currentRight++) {
			
			while(currentLeft < n && leftEdge[currentLeft] <= rightEdge[currentRight]) {
				
				counter += currentLeft - currentRight;
				currentLeft++;
			}
			if (counter > 10000000) return -1;
		}
		return counter;
	}	
}
