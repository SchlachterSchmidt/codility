package countingelements.maxcounters;

public class MaxCounters {

	/*
	 * Calculate the values of counters after applying all alternating
	 * operations: increase counter by 1; set value of all counters to current
	 * maximum.
	 */

	public int[] solution(int n, int[] A) {

		int[] counter = new int[n];
		int max = 0, 
			min = 0, 
			m = A.length;

		for (int i = 0; i < m; i++) {

			if (A[i] <= n) {
				int current = A[i] - 1;
				if (counter[current] < min)
					counter[current] = min + 1;
				else
					counter[current]++;

				if (counter[current] > max)
					max = counter[current];
			} else
				min = max;
		}

		for (int k = 0; k < n; k++)
			if (counter[k] < min)
				counter[k] = min;

		return counter;
	}

}
