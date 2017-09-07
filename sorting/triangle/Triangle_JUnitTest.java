package sorting.triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class Triangle_JUnitTest {
	
	private Triangle tester = new Triangle();

	@Test
	public void baseCaseOne() {
		
		int[] A = {10, 2, 5, 1, 8, 20};
		assertEquals(1, tester.solution(A));
	}
	
	@Test
	public void baseCaseTwo() {
		
		int[] A = {10, 50, 5, 1};
		assertEquals(0, tester.solution(A));
	}
	
	@Test
	public void extremeOverflow() {
		
		int[] A = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
		assertEquals(1, tester.solution(A));
	}

}
