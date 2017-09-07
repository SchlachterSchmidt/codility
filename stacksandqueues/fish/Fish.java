package stacksandqueues.fish;

import java.util.Stack;

public class Fish {

	/*
	 * N voracious fish are moving along a river. Calculate how many fish are
	 * alive.
	 * 
	 * https://codility.com/demo/results/trainingSF886C-GJJ/
	 */

	public int solution(int[] A, int[] B) {

		int count = A.length;
		int n = A.length;
		Stack<Integer> upstream = new Stack<>();

		for (int i = 0; i < n; i++) {
			if (B[i] == 1) { 
				upstream.push(A[i]);
			}

			else {
				while (upstream.size() > 0) {
					count--;
					if (upstream.peek() < A[i]) {
						upstream.pop();
					} else
						break;
				}
			}
		}
		return count;
	}
}