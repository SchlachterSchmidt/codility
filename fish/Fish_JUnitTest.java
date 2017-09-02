package fish;

import static org.junit.Assert.*;

import org.junit.Test;

public class Fish_JUnitTest {
	
	private Fish tester = new Fish();

	@Test
	public void baseCase() {
		
		int[] A = {4, 3, 2, 1, 5};
		int[] B = {0, 1, 0, 0, 0};
		assertEquals(2, tester.solution(A, B));
	}
	
	@Test
	public void baseCaseTwo() {
		
		int[] A = {4, 3, 2, 1, 5};
		int[] B = {0, 1, 0, 1, 0};
		assertEquals(2, tester.solution(A, B));
	}	
	
	@Test
	public void OneDirection() {
		
		int[] A = {4, 3, 2, 1, 5};
		int[] B = {0, 0, 0, 0, 0};
		assertEquals(5, tester.solution(A, B));
	}	
	
	@Test
	public void otherDirection() {
		
		int[] A = {4, 3, 2, 1, 5};
		int[] B = {1, 1, 1, 1, 1};
		assertEquals(5, tester.solution(A, B));
	}
	
	@Test
	public void oneSurvivor() {
		
		int[] A = {4, 3, 2, 1, 5};
		int[] B = {1, 1, 1, 1, 0};
		assertEquals(1, tester.solution(A, B));
	}
}
