package prefixsums.genomicrangequery;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenomicRangeQuery_JUnitTest {
	
	private GenomicRangeQuery tester = new GenomicRangeQuery();

	@Test
	public void baseCase() {
		
		int[] p = {2, 5, 0, 0, 0};
		int[] q  ={4, 5, 6, 1, 6};
		String s = "CAGCCTA";
		int[] exp = {2, 4, 1, 1, 1};
		
		assertArrayEquals(exp, tester.solution(s, p, q));
	}
	
	@Test
	public void sequencialACG() {
		
		int[] p = {0, 0, 0, 0, 0, 0};
		int[] q  ={0, 1, 2, 3, 4, 5};
		String s = "ACGACGACG";
		int[] exp = {1, 1, 1, 1, 1, 1};
		
		assertArrayEquals(exp, tester.solution(s, p, q));
	}	
	
	@Test
	public void individualChars() {
		
		int[] p = {0, 1, 2, 3, 4, 5};
		int[] q  ={0, 1, 2, 3, 4, 5};
		String s = "ACGTACGTACGT";
		int[] exp = {1, 2, 3, 4, 1, 2};
		
		assertArrayEquals(exp, tester.solution(s, p, q));
	}
}
