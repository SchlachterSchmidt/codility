package maximumsliceproblem.maximumslice;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumSlice_JUnitTest {
	
	private MaximumSlice tester = new MaximumSlice();

	@Test
	public void baseCase() {
		
		int[] A = {1, 2, 3, 4, -1};
		assertEquals(10, tester.maxSlice(A));
	}
	
	@Test
	public void baseCaseWikiExample() {
		
		int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		assertEquals(6, tester.maxSlice(A));
	}


}
