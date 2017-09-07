package prefixsums.genomicrangequery;

public class GenomicRangeQuery {

	/*
	 * A DNA sequence can be represented as a string consisting
	 * of the letters A, C, G and T, which correspond to the types
	 * of successive nucleotides in the sequence.
	 * Each nucleotide has an impact factor, which is an integer.
	 * Nucleotides of types A, C, G and T have impact factors
	 * of 1, 2, 3 and 4, respectively. You are going to answer 
	 * several queries of the form: 
	 * What is the minimal impact factor of nucleotides contained 
	 * in a particular part of the given DNA sequence?
	 * 
	 * 
	 * https://codility.com/demo/results/trainingR9JA99-YWE/
	 */
	
public int[] solution(String s, int[] p, int[] q) {
		
		int n = s.length();
		int m = p.length;
		int[] prefSumA = new int[n + 1];
		int[] prefSumC = new int[n + 1];
		int[] prefSumG = new int[n + 1];
		int[] minImpact = new int[m];
		
		// calculating running total of how many times each character occurred in sequence
		// excluding T as count of T can be inferred from count of other three chars
		for (int i = 0; i < n; i++) {
			prefSumA[i + 1] += prefSumA[i] + (s.charAt(i) == 'A' ? 1 : 0);
			prefSumC[i + 1] += prefSumC[i] + (s.charAt(i) == 'C' ? 1 : 0);
			prefSumG[i + 1] += prefSumG[i] + (s.charAt(i) == 'G' ? 1 : 0);
			}

		for (int i = 0; i < m; i ++) {
			int cntA = prefSumA[q[i] + 1] - prefSumA[p[i]];
			int cntC = prefSumC[q[i] + 1] - prefSumC[p[i]];
			int cntG = prefSumG[q[i] + 1] - prefSumG[p[i]];
			// if cntA != 0, minImpact[i] is 1; elseif cntC != 0 minImpact[i] = 2;
			// elseif cntG != 0 minImpact[i] = 3; else 4
			minImpact[i] = (cntA != 0 ? 1 : (cntC != 0 ? 2 : (cntG != 0 ? 3 : 4)));
		}
		return minImpact;		
	} 
}
