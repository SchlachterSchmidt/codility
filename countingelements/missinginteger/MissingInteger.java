package countingelements.missinginteger;

import java.util.HashSet;

public class MissingInteger {
	
	/*
	 find the smallest positive integer that 
	 does not occur in a given sequence.
	 */

	public int solution(int[] A) {

		int max = A[0];
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				set.add(A[i]);
				if (max < A[i]) {
					max = A[i];
				}
			}
		}

		for (int i = 1; i < max + 2; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}

		return 1;
	}
}
