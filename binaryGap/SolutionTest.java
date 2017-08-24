package binarygap;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		Solution tester = new Solution();
		assertEquals("input 11, output 0", 0, tester.solution(1));	
		assertEquals("input 11, output 0", 0, tester.solution(6));	
		assertEquals("input 10, output 2", 1, tester.solution(10));
		assertEquals("input 11, output 0", 2, tester.solution(100));
		assertEquals("input 11, output 0", 5, tester.solution(1041));
		assertEquals("input 11, output 0", 2, tester.solution(51712));	
		assertEquals("input 11, output 0", 29, tester.solution(1073741825));
	}

}
