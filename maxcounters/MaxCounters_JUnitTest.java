package maxcounters;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxCounters_JUnitTest {
	
	private MaxCounters tester = new MaxCounters();

	@Test
	public void baseCase() {
		
		int n = 5;
		int[] A = {3, 4, 4, 6, 1, 4, 4};
		int[] expRes = {3, 2, 2, 4, 2};
		assertArrayEquals(expRes, tester.solution(n, A));
	}

	@Test
	public void noMaximizeOne() {
		
		int n = 5;
		int[] A = {3, 4, 4, 1, 4, 4};
		int[] expRes = {1, 0, 1, 4, 0};
		assertArrayEquals(expRes, tester.solution(n, A));
	}
	
	@Test
	public void noMaximizeTwo() {
		
		int n = 6;
		int[] A = {1, 6, 5, 4, 3, 2, 5, 6, 3, 1, 1, 4, 2};
		int[] expRes = {3, 2, 2, 2, 2, 2};
		assertArrayEquals(expRes, tester.solution(n, A));
	}

	@Test
	public void maximizeAll() {
		
		int n = 3;
		int[] A = {1, 4, 1, 4, 1, 4, 1, 4};
		int[] expRes = {4, 4, 4};
		assertArrayEquals(expRes, tester.solution(n, A));
	}
}
