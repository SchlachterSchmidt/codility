package passingcars;

public class PassingCarsAlt {

	/*
	 * A non-empty zero-indexed array A consisting of N integers is given. The
	 * consecutive elements of array A represent consecutive cars on a road.
	 * 
	 * Array A contains only 0s and/or 1s: - 0 represents a car traveling east,
	 * - 1 represents a car traveling west.
	 * 
	 * The goal is to count passing cars. We say that a pair of cars (P, Q),
	 * where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is
	 * traveling to the west.
	 * 
	 * alternative approach
	 */

	public int solution(int[] A) {


		int passes = 0,
			carCounter = 0;

		for (int car : A) {
			if (car == 0) {
				carCounter++;
			} else if (car == 1) {
				passes += carCounter;
			}
			if (passes > 1000000000)
				return -1;
		}		
		return passes;
	}
}
