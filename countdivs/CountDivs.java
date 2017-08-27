package countdivs;

public class CountDivs {
	
	/*
	 * Write a function:
	 * 
	 * class Solution { public int solution(int A, int B, int K); }
	 * 
	 * that, given three integers A, B and K, returns the number of 
	 * integers within the range [A..B] that are divisible by K, i.e.:
	 * 
	 * { i : A ≤ i ≤ B, i mod K = 0 }
	 * 
	 * https://codility.com/demo/results/trainingAH7BHV-RTC/
	 */
	
	public int solution(int a, int b, int k) {
		
		return (b / k) - Math.floorDiv(a - 1, k);
	}
}
