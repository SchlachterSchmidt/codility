package binarygap;

public class Solution {
	
	public int solution(int n) {
		
		String binRep = Integer.toString(n,2);
		System.out.println("bin rep: " + binRep);
		
		// trimming trailing 0's from the end of binRep
		int i = binRep.length() -1;
		while (binRep.charAt(i) != '1'){
			binRep = binRep.substring(0, i);
			i--;
		}
		
		// finding longest binary gap
		int longestBinGap = 0;
		int currentGap = 0;
		for (char c : binRep.toCharArray()) {
			if (c == '0') {
				currentGap += 1;
				if (currentGap > longestBinGap) {
					longestBinGap = currentGap;
				}
			}
			else {
				currentGap = 0;
			}
		}
		System.out.println("longest binary gap: " + longestBinGap);
		return longestBinGap;
	}
}


