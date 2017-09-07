package leader.equileader;

import java.util.Stack;

public class EquiLeader {

	/*
	 * A non-empty zero-indexed array A consisting of N integers is given.
	 * 
	 * The leader of this array is the value that occurs in more than half of
	 * the elements of A.
	 * 
	 * An equileader is an index S such that 0 ≤ S < N − 1 and two sequences
	 * A[0], A[1], ..., A[S] and A[S + 1], A[S + 2], ..., A[N − 1] have leaders
	 * of the same value.
	 * 
	 * Find the index S such that the leaders of the sequences A[0], A[1], ...,
	 * A[S] and A[S + 1], A[S + 2], ..., A[N - 1] are the same.
	 * 
	 * https://codility.com/demo/results/training2X6XJ2-YF2/
	 */

	public int solution(int[] A) {

		int n = A.length;

		// compute the leader of the whole array
		Stack<Integer> leaderCandidates = new Stack<>();
		for (int i : A) {
			if (leaderCandidates.isEmpty() || leaderCandidates.peek() == i) {
				leaderCandidates.push(i);
			} else {
				leaderCandidates.pop();
			}
		}
		// at this point, the only values left on the stack (if any) are all
		// equal and the only remaining candidate for a leader. 
		// Scan the array again to count if occurrence of 
		// leaderCandidate > n / 2. Else there is no leader and by extension 
		// no equiLeader.
		int leaderCandidate = 0;
		if (!leaderCandidates.isEmpty()) {
			leaderCandidate = leaderCandidates.pop();
		} else
			return 0;

		int candidateCounter = 0;
		int leader = 0;
		for (int i : A) {
			if (i == leaderCandidate) {
				candidateCounter++;
			}
		}
		if (candidateCounter > n / 2) {
			leader = leaderCandidate;
		} else
			return 0;

		// if there is a leader, we can now compute the count of equiLeaders
		int lhsLeaderCount = 0;
		int rhsLeaderCount = candidateCounter;
		int equileaderCount = 0;
		for (int i = 0; i < n; i++) {
			if (A[i] == leader) {
				lhsLeaderCount++;
				rhsLeaderCount--;
			}
			if (lhsLeaderCount > ((i + 1) / 2) && rhsLeaderCount > (n - (i + 1)) / 2) {
				equileaderCount++;
			}
		}

		return equileaderCount;
	}

}
