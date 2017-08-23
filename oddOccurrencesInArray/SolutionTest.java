package oddOccurrencesInArray;

import static org.junit.Assert.*;

import org.junit.Test;

import oddOccurrencesInArray.Solution;

public class SolutionTest {


	@Test
	public void test() {
		Solution tester = new Solution();
		int[] A = {1,1,2,2,3,3,4};
		assertEquals("input 11, output 0", 4, tester.solution(A));	
		int[] B = {1,1,2,2,3,3,4,1,1,2,2,5,5,3,3};
		assertEquals("input 11, output 0", 4, tester.solution(B));	
	}

}
