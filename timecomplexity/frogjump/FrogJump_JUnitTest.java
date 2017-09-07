package timecomplexity.frogjump;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrogJump_JUnitTest {

	private FrogJump tester = new FrogJump();
	
	@Test
	public void baseCase() {
		int x = 10;
		int y = 85;
		int d = 30;
		assertEquals("x = 10, y = 85, d = 30", 3, tester.solution(x, y, d));
	}
	
	@Test
	public void smallD() {
		int x = 10;
		int y = 85;
		int d = 1;
		assertEquals("x = 10, y = 85, d = 1", 75, tester.solution(x, y, d));
	}
	
	@Test
	public void largeD() {
		int x = 10;
		int y = 85;
		int d = 100;
		assertEquals("x = 10, y = 85, d = 100", 1, tester.solution(x, y, d));
	}
}
