package sorting.numberofdiscintersections;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberOfDiscIntersections_JUnitTest {
	
	private NumberOfDiscIntersections test = new NumberOfDiscIntersections();


	@Test
	public void baseCase() {
		
		int[] A = {1, 5, 2, 1, 4, 0};
		assertEquals(11, test.solution(A));
	}
	
	@Test
	public void allOnes() {
		
		int[] A = {1, 1, 1};
		assertEquals(3, test.solution(A));
	}

	@Test
	public void overflowTest() {
		
		int[] A = {1, 2147483647, 0};
		assertEquals(2, test.solution(A));
	}
}
