package prefixsums.minavgtwoslice;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinAvgTwoSlice_JUnitTest {

	private MinAvgTwoSlice tester = new MinAvgTwoSlice();
	
	@Test
	public void baseCase() {
		
		int[] A = {5, 2, 2, 5, 1, 5, 8};
		assertEquals(1, tester.solution(A));
	}

}
