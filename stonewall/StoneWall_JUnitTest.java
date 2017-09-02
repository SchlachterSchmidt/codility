package stonewall;

import static org.junit.Assert.*;

import org.junit.Test;

public class StoneWall_JUnitTest {
	
	private StoneWall tester = new StoneWall();

	@Test
	public void staircase() {
		int[] A = {1, 2, 3};
		assertEquals(3, tester.solution(A));
	}
	
	
	@Test
	public void pyramid() {
		int[] A = {1, 2, 3, 2, 1};
		assertEquals(3, tester.solution(A));
	}
	
	@Test
	public void pyramidAndTower() {
		int[] A = {1, 2, 3, 2, 1, 4};
		assertEquals(4, tester.solution(A));
	}
	
	@Test
	public void baseCase() {
		int[] A = {8, 8, 5, 7, 9, 8, 7, 4, 8};
		assertEquals(7, tester.solution(A));
	}
	
}
