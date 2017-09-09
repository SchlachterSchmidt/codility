package maximumsliceproblem.maxslicesum;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxSliceSum_JUnitTest {
	
	private MaxSliceSum tester = new MaxSliceSum();

	@Test
	public void baseCase() {
		int[] A = {3, 2, -6, 4, 0};
		assertEquals(5, tester.solution(A));
	}
	
	@Test
	public void allNegative() {
		int[] A = {-3, -2, -6, -4};
		assertEquals(-2, tester.solution(A));
	}
	
	@Test
	public void singleElement() {
		int[] A = {5};
		assertEquals(5, tester.solution(A));
	}
	
	@Test
	public void singleNegElement() {
		int[] A = {-5};
		assertEquals(-5, tester.solution(A));
	}

}
