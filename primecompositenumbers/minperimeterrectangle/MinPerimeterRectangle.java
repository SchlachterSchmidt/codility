package primecompositenumbers.minperimeterrectangle;

public class MinPerimeterRectangle {

	/*
	 * Find the minimal perimeter of any rectangle whose area equals N.
	 * 
	 * https://codility.com/demo/results/trainingZ2H9MU-XEB/
	 */

	public int solution(int a) {

		int minPerimeter = Integer.MAX_VALUE;

		for (int i = 1; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				minPerimeter = Math.min(minPerimeter, 2 * (a / i + i));
			}
		}
		return minPerimeter;
	}
}
