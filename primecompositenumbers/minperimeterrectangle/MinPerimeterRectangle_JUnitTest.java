package primecompositenumbers.minperimeterrectangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinPerimeterRectangle_JUnitTest {
	
	private MinPerimeterRectangle tester = new MinPerimeterRectangle();

	@Test
	public void baseCase() {
		assertEquals(22, tester.solution(30));
	}
	
	@Test
	public void simpleCaseOne() {
		assertEquals(204, tester.solution(101));
	}
	
	@Test
	public void areaOfOne() {
		assertEquals(4, tester.solution(1));
	}
	
	@Test
	public void areaIsPrime() {
		assertEquals(30972904, tester.solution(15486451));
	}
	@Test
	public void areaIsSquare() {
		assertEquals(4000, tester.solution(1000000));
	}
}
