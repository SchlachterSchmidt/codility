package maximumsliceproblem.maxslicesum;

public class MaxSliceSum {

	/*
	 * Find a maximum sum of a compact subsequence of array elements.
	 * 
	 * https://codility.com/demo/results/trainingVJNXP8-FPV/
	 */
	
	public int solution(int[] A) {
		
		long maxSliceSum = Integer.MIN_VALUE;
		long currentSlice = Integer.MIN_VALUE;

		for (int i : A) {
			currentSlice = Math.max(currentSlice + i, i);
			maxSliceSum = Math.max(maxSliceSum, currentSlice);
		}
		
		return (int)maxSliceSum;
	}
}
