package cyclicrotation;

import org.junit.Assert;
import org.junit.Test;
import cyclicrotation.Solution;

public class CyclicRotation_JUnitTest {
	
	Solution test = new Solution();
	int[] AllPositiveArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	int[] MixedArray = {1, 2, -3, 4, -5, 6, -7, 8, 9};
	
	@Test
	public void rotateByPositiveKWithAllPostiveArray() {
		
		int k = 3;
		int[] ExRes = {7, 8, 9, 1, 2, 3, 4, 5, 6};
		int[] Res = test.solution(AllPositiveArray, k);
		
		Assert.assertArrayEquals( Res, ExRes );
	}
	
	@Test
	public void rotateByZeroWithAllPostiveArray() {
		
		int k = 0;
		int[] ExRes = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] Res = test.solution(AllPositiveArray, k);
		
		Assert.assertArrayEquals(ExRes, Res);
	}
	
	@Test
	public void rotateByZeroWithMixedArray() {
		
		int k = 0;
		int[] ExRes = {1, 2, -3, 4, -5, 6, -7, 8, 9};
		int[] Res = test.solution(MixedArray, k);
		
		Assert.assertArrayEquals(ExRes, Res);
	}
	
	@Test
	public void rotateByPositiveKWithMixedArray() {
		
		int k = 3;
		int[] ExRes = { -7, 8, 9, 1, 2, -3, 4, -5, 6};
		int[] Res = test.solution(MixedArray, k);
		
		Assert.assertArrayEquals(ExRes, Res);
	}
}