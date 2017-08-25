package permmissingelement;

public class Solution {
	
	private long permSum(long n) {
		return (n * (n + 1) /  2 );
	}
	
	public int solution(int[] A) {
		
		long n = A.length;
		long sum = 0;
		
		for (int i : A)
			sum += i;
		
		return (int)(permSum( n + 1) - sum);
	}
}
