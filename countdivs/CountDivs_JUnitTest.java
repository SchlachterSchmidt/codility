package countdivs;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountDivs_JUnitTest {
	
	private CountDivs tester = new CountDivs();
	
	@Test
	public void simpleTestDivByOne() {
		int a = 10,
			b = 20,
			k = 1;
		assertEquals(11, tester.solution(a, b, k));
	}

	@Test
	public void simpleTestDivByTwo() {
		int a = 10,
			b = 20,
			k = 2;
		assertEquals(6, tester.solution(a, b, k));
	}
	
	@Test
	public void baseCase() {
		int a = 6,
			b = 11,
			k = 2;
		assertEquals(3, tester.solution(a, b, k));
	}
	
	@Test
	public void largeRangeSmallK() {
		int a = 1,
			b = Integer.MAX_VALUE,
			k = 10;
		assertEquals(Integer.MAX_VALUE / 10, tester.solution(a, b, k));
	}
	
	@Test
	public void largeRangeLargeK() {
		int a = 1,
			b = Integer.MAX_VALUE,
			k = Integer.MAX_VALUE;
		assertEquals(1, tester.solution(a, b, k));
	}

}
