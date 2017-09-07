package stacksandqueues.stonewall;

import java.util.Stack;

public class StoneWall {
	
	/*
	 * You are going to build a stone wall. The height of the wall is
	 * specified by a zero-indexed array H of N positive integers. 
	 * 
	 * The wall should be built of cubic stone blocks (that is, all sides of
	 * such blocks are rectangular). Your task is to compute the minimum number
	 * of blocks needed to build the wall.
	 * 
	 * https://codility.com/demo/results/trainingNGG2R2-4YV/
	 */

	public int solution(int[] A) {
		
		int n = A.length;
		Stack<Integer> activeBlocks = new Stack<>();
		
		// starting with the first block, and result is at least 1
		activeBlocks.push(A[0]);
		int result = 1;
		
		for (int i = 1; i < n; i++) {
			// if the current height is greater than the head of the stack
			// push the current height onto the stack, and increase count by 1
			if(A[i] > activeBlocks.peek()) {
				activeBlocks.push(A[i]);
				result++;
			}
			
			// else, if the current height is lower, keep popping from the stack until the head
			// is smaller or the stack is empty
			while ( A[i] < activeBlocks.peek()) {
				activeBlocks.pop();
				// if the stack is empty, we start a new section of the wall, by pushing the current 
				// height onto the stack and increasing the count
				if (activeBlocks.isEmpty()) {
					activeBlocks.push(A[i]);
					result++;
					break;
				}
				// if the stack was not empty and the height is increasing again we increase the count by 1
				else if (A[i] > activeBlocks.peek()) {
					activeBlocks.push(A[i]);
					result++;
					break;
				}
				
			}
		}
		
		return result;
	}
}
