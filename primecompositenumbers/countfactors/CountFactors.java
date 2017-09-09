package primecompositenumbers.countfactors;

public class CountFactors {
	
	/*
	 * Count factors of given number n.
	 * 
	 * https://codility.com/demo/results/trainingSS399V-PTE/
	 */

	public int solution(int n) {
		
		int factors = 0;
		int sqrtn = (int)Math.sqrt(n);
		
		for (int i = 1; i <= sqrtn; i++)
			if (n % i == 0) factors += 2;
		
		// counting the factor only once if n is a perfect square
		if (sqrtn * sqrtn == n) factors--;
		
		return factors;
	}
}
