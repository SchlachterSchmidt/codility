package arrays.cyclicrotation;

import org.junit.Assert;
import org.junit.Test;
import arrays.cyclicrotation.CyclicRotation;;

public class CyclicRotation_JUnitTest {
	
	private CyclicRotation test = new CyclicRotation();
	private int[] AllPositiveArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	private int[] MixedArray = {1, 2, -3, 4, -5, 6, -7, 8, 9};
	
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
