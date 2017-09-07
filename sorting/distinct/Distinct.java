package sorting.distinct;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

	/*
	 * Write a function that, given a zero-indexed array A consisting of N
	 * integers, returns the number of distinct values in array A.
	 * 
	 * https://codility.com/demo/results/training3SGHV5-HAX/
	 */

	public int solution(int[] A) {

		Set<Integer> set = new HashSet<Integer>();

		for (int i : A) {
			set.add(i);
		}

		return set.size();
	}
}
