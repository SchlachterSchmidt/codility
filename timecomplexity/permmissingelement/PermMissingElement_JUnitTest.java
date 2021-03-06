package timecomplexity.permmissingelement;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermMissingElement_JUnitTest {
	
	private Solution tester = new Solution();
	
	@Test
	public void caseOneElement() {
		int[] A = {2};
		assertEquals("given B = {2}, returns 1", 1, tester.solution(A));
	}
	
	@Test
	public void caseGeneralCase() {
		int[] B = {1, 2, 4};
		assertEquals("given A = {1, 2, 4}, returns 3", 3, tester.solution(B));
	}
	
	@Test
	public void caseLargeInput() {
		int[] C = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16 ,17, 18 ,19};
		assertEquals("given A = {1 ... 10, 12 ... 19}, returns 11", 11, tester.solution(C));
	}	
}
