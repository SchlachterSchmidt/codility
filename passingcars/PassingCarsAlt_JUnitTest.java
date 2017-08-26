package passingcars;

import static org.junit.Assert.*;

import org.junit.Test;

public class PassingCarsAlt_JUnitTest {
	
	private PassingCarsAlt tester = new PassingCarsAlt();
	
	@Test
	public void generalCase() {
		int[] A = {0, 1, 0, 1, 1};
		assertEquals(5, tester.solution(A));
		
	}
	
	@Test
	public void oneWay() {
		int[] A = {1, 1, 1, 1, 1};
		assertEquals(0, tester.solution(A));
	}
	
	@Test
	public void oneDirection() {
		int[] A = {0, 1, 1, 1, 1};
		assertEquals(4, tester.solution(A));
	}
}
