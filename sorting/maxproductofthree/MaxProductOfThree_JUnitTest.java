package sorting.maxproductofthree;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxProductOfThree_JUnitTest {

	private MaxProductOfThree tester = new MaxProductOfThree();
	
	@Test
	public void baseCase() {
		int[]A = {1, 2, 3, 4, 5};
		assertEquals(60, tester.solution(A));
	}
	
	@Test
	public void baseCaseWithNeg() {
		int[]A = {-100, 1, 2, 3, 4, 5, -200};
		assertEquals(100000, tester.solution(A));
	}
	
	@Test
	public void allNeg() {
		int[]A = {-100, -200, -300, -3, -4, -5, -200};
		assertEquals(-60, tester.solution(A));
	}

}
