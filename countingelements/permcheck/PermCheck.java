package countingelements.permcheck;

import java.util.HashSet;

public class PermCheck {
	
	/*
	 * Check whether array A is a permutation
	 */

	public int solution(int[] A) {

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < A.length; i++)
			set.add(A[i]);

		for (int i = 1; i < A.length + 1; i++) 
			if (!set.contains(i)) return 0;

		return 1;
	}
}
