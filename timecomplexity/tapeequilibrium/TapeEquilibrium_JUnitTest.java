package timecomplexity.tapeequilibrium;

import static org.junit.Assert.*;

import org.junit.Test;

public class TapeEquilibrium_JUnitTest {
	
	private TapeEquilibrium tester = new TapeEquilibrium();

	@Test
	public void baseCase() {
		
		int[] A = {3, 1, 2, 4, 3};
		assertEquals(1, tester.solution(A));
	}
	
	@Test
	public void posNegRange() {
		int[] A = {3, -1, 2, 4, -3};
		assertEquals(1, tester.solution(A));
	}
	
	@Test
	public void posNegLargeRange() {
		int[] A = {-50, -10, 22, 44, -34};
		assertEquals(40, tester.solution(A));
	}
}
