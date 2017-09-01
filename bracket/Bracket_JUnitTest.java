package bracket;

import static org.junit.Assert.*;

import org.junit.Test;

public class Bracket_JUnitTest {
	
	private Bracket tester = new Bracket();

	@Test
	public void baseCasePositive() {
		String S = "{[()()]}";
		assertEquals(1, tester.solution(S));
	}
	
	@Test
	public void baseCaseNegative() {
		String S = "([)()]";
		assertEquals(0, tester.solution(S));
	}
	
	@Test
	public void trailingClosingBracket() {
		String S = "{[()()]})";
		assertEquals(0, tester.solution(S));
	}
	
	@Test
	public void trailingOpenBracket() {
		String S = "{[()()]}(";
		assertEquals(0, tester.solution(S));
	}
	
	@Test
	public void leadingOpenBracket() {
		String S = "({[()()]}";
		assertEquals(0, tester.solution(S));
	}
	
	@Test
	public void leadingClosingBracket() {
		String S = "}{[()()]}";
		assertEquals(0, tester.solution(S));
	}

}
