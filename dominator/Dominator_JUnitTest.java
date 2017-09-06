package dominator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Dominator_JUnitTest {
	
	private Dominator tester = new Dominator();

	@Test
	public void baseCase() {
		int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
		assertEquals(7, tester.solution(A));
	}
	@Test
	public void singleLargeElement() {
		int[] A = {2147483647};
		assertEquals(0, tester.solution(A));
	}
	

}
