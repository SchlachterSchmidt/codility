package oddoccurrencesinarray;

import static org.junit.Assert.*;

import org.junit.Test;

import oddoccurrencesinarray.Solution;

public class OddOccurrenesInArray_JUnitTest {

	Solution tester = new Solution();

	@Test
	public void generalCase() {
		
		int[] A = {1,1,2,2,3,3,4};
		assertEquals("input 11, output 0", 4, tester.solution(A));	
	}
	
	@Test
	public void largeArray() {
		
		int[] B = {1,1,2,2,3,3,4,1,1,2,2,5,5,3,3};
		assertEquals("input 11, output 0", 4, tester.solution(B));	
	}
	
	@Test
	public void oneElementArray() {
		
		int[] B = {3};
		assertEquals("input 11, output 0", 3, tester.solution(B));		
	}
}
