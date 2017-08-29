package distinct;

import static org.junit.Assert.*;

import org.junit.Test;

public class Distinct_JUnitTest {
	
	private Distinct tester = new Distinct();

	@Test
	public void baseCase() {
		int[] A = {1, 2, 3};
		assertEquals(3, tester.solution(A));
	}
	
	@Test
	public void baseCaseDuplicates() {
		int[] A = {1, 2, 3, 1, 3, 2, 1};
		assertEquals(3, tester.solution(A));
	}
	
	@Test
	public void baseCaseLargeRange() {
		int[] A = {-10000, 1, 2, 3, 1, 3, 2, 1, 50000};
		assertEquals(5, tester.solution(A));
	}
}
