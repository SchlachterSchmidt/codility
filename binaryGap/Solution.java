package binaryGap;

public class Solution {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution test = new Solution();
		int x = test.solution(6);
	}

	public int solution(int n) {
		
		String binRep = Integer.toString(n,2);
		System.out.println("bin rep: " + binRep);
		
		int i = binRep.length() -1;
		while (binRep.charAt(i) != '1'){
			binRep = binRep.substring(0, i);
			i--;
		}
		
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


