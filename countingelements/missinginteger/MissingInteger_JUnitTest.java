package countingelements.missinginteger;

import static org.junit.Assert.*;

import org.junit.Test;

public class MissingInteger_JUnitTest {

	private MissingInteger tester = new MissingInteger();

	@Test
	public void baseCasetOne() {
		int[] A = { 1, 3, 6, 4, 1, 2 };
		assertEquals(5, tester.solution(A));
	}

	@Test
	public void baseCasetTwo() {
		int[] A = { 1, 2, 3 };
		assertEquals(4, tester.solution(A));
	}

	@Test
	public void baseCasetThree() {
		int[] A = { -1, -3 };
		assertEquals(1, tester.solution(A));
	}
	

	@Test
	public void caseAllNeg() {
		int[] A = { -4, -5, -3};
		assertEquals(1, tester.solution(A));
	}


}
