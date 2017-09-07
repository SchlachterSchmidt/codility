package countingelements.frogriverone;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrogRiverOne_JUnitTest {

	private FrogRiverOne tester = new FrogRiverOne();
	
	@Test
	public void baseCase() {
		
		int x = 5;
		int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
		assertEquals(6, tester.solution(x, A));
	}

}
