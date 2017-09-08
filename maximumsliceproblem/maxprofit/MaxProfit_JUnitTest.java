package maximumsliceproblem.maxprofit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxProfit_JUnitTest {
	
	private MaxProfit tester = new MaxProfit();

	@Test
	public void baseCase() {
		// max profit is A[5] - A[1]
		int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
		assertEquals(356, tester.solution(A));
	}
	
	@Test
	public void stairCase() {
		int[] A = {100, 200, 300, 400, 500, 600};
		assertEquals(500, tester.solution(A));
	}	
	
	@Test
	public void onlyLoss() {
		int[] A = {500, 400, 300, 200, 100};
		assertEquals(0, tester.solution(A));
	}
}
