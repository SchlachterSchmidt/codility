package leader.dominator;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

	/*
	 * Find an index of an array such that its value occurs at more than half of
	 * indices in the array.
	 * 
	 * https://codility.com/demo/results/trainingXPYHJ2-5J4/
	 */

	public int solution(int[] A) {

		Map<Integer, Integer> intMap = new HashMap<>();
		int n = A.length;

		// special case - if A contains only one element, it is the dominator
		if (n == 1)
			return 0;

		for (int i = 0; i < n; i++) {
			if (!intMap.containsKey(A[i]))
				intMap.put(A[i], 1);
			else {
				Integer count = (intMap.get(A[i]) + 1);
				intMap.put(A[i], count);
				if (count > n / 2) {
					return i;
				}
			}
		}
		return -1;
	}
}
