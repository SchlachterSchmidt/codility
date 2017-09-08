package maximumsliceproblem.maxdoubleslicesum;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxDoubleSliceSum_JUnitTest {
	
	private MaxDoubleSliceSum tester = new MaxDoubleSliceSum();

	@Test
	public void baseCase() {
		int[] A = {3, 2, 6, -1, 4, 5, -1, 2};
		assertEquals(17, tester.solution(A));
	}

	@Test
	public void smallInputNoDoubleSlice() {
		int[] A = {3, 2, 6};
		assertEquals(0, tester.solution(A));
	}
	
	@Test
	public void smallInput() {
		int[] A = {3, 2, 6, 1};
		assertEquals(6, tester.solution(A));
	}
	
	@Test
	public void sliceOutNegativeVal() {
		int[] A = {2, 1, -1, 3, 4};
		assertEquals(4, tester.solution(A));
	}

}
