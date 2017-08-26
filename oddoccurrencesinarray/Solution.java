package oddoccurrencesinarray;

public class Solution {
	
	/*
	 * Find value that occurs in odd number of elements
	 */

	public int solution(int[] A) {
		
		int result = 0;
		for(int i : A) 
		    result ^= i;
		
		return result;
	}

}
