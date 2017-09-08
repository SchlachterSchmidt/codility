package maximumsliceproblem.maxdoubleslicesum;

public class MaxDoubleSliceSum {
	
	/*
	 * Find the maximal sum of any double slice.
	 * 
	 * https://codility.com/demo/results/trainingQ5JUTN-3K7/
	 */
	
	public int solution(int[] A) {
		
		int n = A.length;
		int[] leftMax = new int[n];
		int[] rightMax = new int[n];
		
		
		for (int i = 1; i < n - 1; i++) {
			leftMax[i] = Math.max(0, leftMax[i -1 ] + A[i]);
		}
		
		for (int i = n - 2; i > 0; i--) {
			rightMax[i] = Math.max(0, rightMax[i + 1] + A[i]);
		}
		
		int max = 0;
		
		for (int i = 1; i < n - 1; i++) {
			max = Math.max(max, leftMax[i -1] + rightMax[i + 1]);
		}
		
		return max;
	}

}
