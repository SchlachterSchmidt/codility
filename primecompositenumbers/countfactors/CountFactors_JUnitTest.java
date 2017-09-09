package primecompositenumbers.countfactors;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountFactors_JUnitTest {
	
	private CountFactors tester = new CountFactors();

	@Test
	public void baseCase() {
		assertEquals(8, tester.solution(24));
	}
	
	@Test
	public void largeN() {
		assertEquals(64, tester.solution(10000000));
	}

	
	@Test
	public void extremeCase() {
		assertEquals(2, tester.solution(Integer.MAX_VALUE));
	}

}
