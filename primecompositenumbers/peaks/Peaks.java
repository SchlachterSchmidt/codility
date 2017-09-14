package primecompositenumbers.peaks;

import java.util.ArrayList;

public class Peaks {

	/*
	 * Divide an array into the maximum number of same-sized blocks, each of
	 * which should contain an index P such that A[P - 1] < A[P] > A[P + 1].
	 * 
	 * https://codility.com/demo/results/trainingV3F3KR-SJQ/
	 */

	public int solution(int[] A) {

		// count number of peaks and adding them to list peaks
		int n = A.length;
		ArrayList<Integer> peaks = new ArrayList<Integer>();

		for (int i = 1; i < n - 1; i++) {

			if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
				peaks.add(i);
			}
		}

		// return 0 if there are no peaks
		if (peaks.size() == 0)
			return 0;

		// divide A in as many equal subsections as possible with at least one
		// peak starting from the maximum number blocks we can have
		for (int blockCount = peaks.size(); blockCount > 0; blockCount--) {
			if (n % blockCount != 0)
				continue;
			// we will count the number of blocks that have a peak in it and
			// compare it against the number of blocks. If they are equal, 
			// we found the solution. As we start from the max number of blocks, 
			// the first solution is also the best
			int blockSize = n / blockCount;
			int currentBlock = blockSize;
			int blocksWithPeak = 0;

			// for every peak, check if the peak is in a block
			for (int peakIter = 0; peakIter < peaks.size(); peakIter++) {
				// exploiting the fact that Java drops the remainder of division
				// by default, we know that if dividing the index of the current
				// peak by the index of the last element in the block equals 0, 
				// the peak is inside the block
				int currentPeak = peaks.get(peakIter);
				if (currentPeak / currentBlock == 0) {
					// if we found one peak in the current block, we increase 
					// the count of blocks with peaks, skip all remaining peaks
					// in this block and move on to the next block
					blocksWithPeak += 1;
					while (peakIter + 1 < peaks.size() && 
							peaks.get(peakIter + 1) < currentBlock) {
						peakIter++;
					}
					currentBlock += blockSize;
				}
			}
			// now we check if the number of blocks equals the number of blocks
			// with peaks. if yes, we're done
			if (blockCount == blocksWithPeak) {
				return blockCount;
			}
		}
		return 0;
	}
}
