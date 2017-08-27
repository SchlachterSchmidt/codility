package countdivs;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountDivs_JUnitTest {

	private CountDivs tester = new CountDivs();

	@Test
	public void simpleTestDivByOne() {
		int a = 10;
		int b = 20;
		int k = 1;
		assertEquals(11, tester.solution(a, b, k));
	}

	@Test
	public void simpleTestDivByTwo() {
		int a = 10;
		int b = 20;
		int k = 2;
		assertEquals(6, tester.solution(a, b, k));
	}

	@Test
	public void baseCase() {
		int a = 6;
		int b = 11;
		int k = 2;
		assertEquals(3, tester.solution(a, b, k));
	}

	@Test
	public void largeRangeSmallK() {
		int a = 1;
		int b = Integer.MAX_VALUE;
		int k = 10;
		assertEquals(Integer.MAX_VALUE / 10, tester.solution(a, b, k));
	}

	@Test
	public void largeRangeLargeK() {
		int a = 1;
		int b = Integer.MAX_VALUE;
		int k = Integer.MAX_VALUE;
		assertEquals(1, tester.solution(a, b, k));
	}

}
