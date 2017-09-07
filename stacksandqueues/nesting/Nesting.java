package stacksandqueues.nesting;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Nesting {
	
	/*
	 * Determine whether given string of parentheses is properly nested.
	 * 
	 * https://codility.com/demo/results/trainingRZMREU-CWT/
	 */
	
	public int solution(String S) {
		
		int n = S.length();
		Stack<Character> stack = new Stack<>();
		Map<Character, Character> opposite = new HashMap<>();
		
		opposite.put(')', '(');
		
		for (int i = 0; i < n; i++) {
			char c = S.charAt(i);
			if (c == '(') {
				stack.push(c);
			}
			else {
				if(!stack.isEmpty() && opposite.get(c) == stack.peek()) {
					stack.pop();
				}
				else return 0;
			}
		}
		
		return (stack.isEmpty() ? 1 : 0);
	}
}
