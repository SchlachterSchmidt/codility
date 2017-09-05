package equileader;

import static org.junit.Assert.*;

import org.junit.Test;

public class EquiLeader_JUnitTest {

	private EquiLeader tester = new EquiLeader();

	@Test
	public void baseCase() {

		int[] A = {4, 3, 4, 4, 4, 2};
		assertEquals(2, tester.solution(A));
	}

	@Test
	public void baseCaseNoLeaderAllDiffer() {

		int[] A = {1, 2, 3, 4};
		assertEquals(-1, tester.solution(A));
	}
	
	@Test
	public void baseCaseNoLeaderNoMajority() {

		int[] A = {1, 2, 3, 4, 4};
		assertEquals(-1, tester.solution(A));
	}
	
	@Test
	public void twoDifferentNumbers() {

		int[] A = {1, 2};
		assertEquals(0, tester.solution(A));
	}
}
