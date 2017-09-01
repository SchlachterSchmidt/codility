package bracket;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Bracket {

	/*
	 * Determine whether a given string of parentheses is properly nested.
	 * 
	 * https://codility.com/demo/results/training49MJ76-3UV/
	 */

	public int solution(String S) {

		char[] charArr = S.toCharArray();
		Stack<Character> charStack = new Stack<>();
		Map<Character, Character> opposites = new HashMap<>();

		opposites.put('}', '{');
		opposites.put(']', '[');
		opposites.put(')', '(');

		for (char c : charArr) {

			if (c == '[' || c == '(' || c == '{') {
				charStack.push(c);
			}

			else {
				if (!charStack.isEmpty()) {
					char prev = charStack.pop();
					if (prev != opposites.get(c)) {
						return 0;
					}
				} else
					return 0;
			}
		}
		return (charStack.isEmpty() ? 1 : 0);
	}
}
