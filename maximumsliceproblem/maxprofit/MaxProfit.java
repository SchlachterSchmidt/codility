package maximumsliceproblem.maxprofit;

public class MaxProfit {
	
	/*
	 * Given a log of stock prices compute the maximum possible earning.
	 * 
	 * https://codility.com/demo/results/trainingFSHN6R-3S9/
	 */
	
	public int solution(int[] A) {
		
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for (int price : A) {
			minPrice = Math.min(minPrice, price);
			maxProfit = Math.max(maxProfit, price - minPrice);
		}
		
		return maxProfit;
	}

}
