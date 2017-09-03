package nesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Nesting_JUnitTest {
	
	private Nesting tester = new Nesting();
	
	@Test
	public void baseCase() {
		String S = "(())";
		assertEquals(1, tester.solution(S));
	}

	@Test
	public void emptyString() {
		String S = "";
		assertEquals(1, tester.solution(S));
	}
	
	@Test
	public void baseCaseTwo() {
		String S = "(())(())";
		assertEquals(1, tester.solution(S));
	}
	
	@Test
	public void failLeadingBracket() {
		String S = "((())(())";
		assertEquals(0, tester.solution(S));
	}
	

	@Test
	public void failTrailingBracket() {
		String S = "(())(()))";
		assertEquals(0, tester.solution(S));
	}

	@Test
	public void failMiddleBracket() {
		String S = "(())((())";
		assertEquals(0, tester.solution(S));
	}
}
