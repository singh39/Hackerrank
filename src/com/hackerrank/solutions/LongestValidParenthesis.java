package com.hackerrank.solutions;
import java.util.Stack;

public class LongestValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = ")(()";
		System.out.println(getLongestValidParenthesis(s));
	}

	private static int getLongestValidParenthesis(String s) {
		int result = 0;
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == '(') {
				stack.push(i);
			}
			else {
				if (!stack.isEmpty()) {
					stack.pop();
					int current = i - stack.peek();
					result = Math.max(result, current);
				}
				else {
					stack.push(i);
				}
			}
		}
		
		return result;
	}

}
