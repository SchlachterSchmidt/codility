package iterations.binarygap;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryGap_JUnitTest {
	
	private BinaryGap tester = new BinaryGap();

	@Test
	public void caseZero() {
		assertEquals("input 1, output 0", 0, tester.solution(1));
		assertEquals("input 10, output 1", 1, tester.solution(10));
		assertEquals("input 100, output 2", 2, tester.solution(100));
		assertEquals("input 1041, output 5", 5, tester.solution(1041));
	}
	
	@Test
	public void caseTrailingZero() {
		assertEquals("input 6, output 0", 0, tester.solution(6));
		assertEquals("input 51712, output 2", 2, tester.solution(51712));
	}
	
	@Test
	public void caseLarge() {
		assertEquals("input 1073741825, output 29", 29, tester.solution(1073741825));
	}

}
