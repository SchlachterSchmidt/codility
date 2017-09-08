package maximumsliceproblem.maximumslice;

public class MaximumSlice {

	/*
	 * Kadane's algorithm
	 */
	
	public int maxSlice(int[] A) {
		
		int maxSlice = 0;
		int maxEnding = 0;
		
		for (int i : A) {
			maxEnding = Math.max(0, (maxEnding + i));
			maxSlice = Math.max(maxEnding, maxSlice);
		}
		
		return maxSlice;
	}
}
