package frogriverone;

public class FrogRiverOne {
	
	/*
	 * Find the earliest time when a frog can jump to the other side of a river
	 */
	
	public int solution(int x, int[] A) {
		
		int sum = 0;
		int[] path = new int[x];
		
		for (int i = 0; i < A.length; i++){
			if (path[A[i] - 1] == 0) {
				path[A[i] - 1] = 1;
				sum += 1;
			}
			
			if (sum == x) return i;

		}
	return -1;
	}
}
