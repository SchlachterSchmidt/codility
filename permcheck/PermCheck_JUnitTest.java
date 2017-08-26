package permcheck;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermCheck_JUnitTest {
	
	private PermCheck tester = new PermCheck();
	

	@Test
	public void baseCaseOne() {
		int[] A = {1, 2, 3, 4};
		assertEquals(1, tester.solution(A));
	}
	
	@Test
	public void baseCaseTwo() {
		int[] A = {4, 1, 3};
		assertEquals(0, tester.solution(A));
	}
	
	@Test
	public void antiSum() {
		int[] A = {1, 4, 1};
		assertEquals(0, tester.solution(A));
	}
	
	@Test
	public void singleElement() {
		int[] A = {2};
		assertEquals(0, tester.solution(A));
	}
	
	@Test
	public void twoElements() {
		int[] A = {2, 3};
		assertEquals(0, tester.solution(A));
	}
}
