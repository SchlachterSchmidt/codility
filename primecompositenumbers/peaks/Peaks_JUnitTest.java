package primecompositenumbers.peaks;

import static org.junit.Assert.*;

import org.junit.Test;

public class Peaks_JUnitTest {

	private Peaks tester = new Peaks();
	
	@Test
	public void baseCase() {
		
		int[] A = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
		assertEquals(3, tester.solution(A));
	}
	
	@Test
	public void threePeaksThreeBlocks() {
		
		int[] A = {0, 1, 0, 0, 1, 0, 0, 1, 0};
		assertEquals(3, tester.solution(A));
	}

	@Test
	public void noPeaks() {
		
		int[] A = {0, 1, 2, 3, 4, 5};
		assertEquals(0, tester.solution(A));
	}

	@Test
	public void threePeaksTwoBlocks() {
		
		int[] A = {0, 1, 0, 1, 0, 0, 0, 1, 0, 0};
		assertEquals(2, tester.solution(A));
	}

	@Test
	public void onePeakOneBlock() {
		
		int[] A = {0, 1, 2, 3, 4, 3, 2, 1, 0};
		assertEquals(1, tester.solution(A));
	}
	
	
	@Test
	public void blocksWithMoreThanOnePeak() {

		int[] A = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0};
		assertEquals(3, tester.solution(A));
	}
	
	
}
