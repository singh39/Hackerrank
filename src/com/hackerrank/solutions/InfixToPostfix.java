package com.hackerrank.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		
		String s = "A + B - C";
		
		Map<Character, Integer> opr = init();
		
		System.out.println(infixToPost(s, opr));
		
		

	}

	private static String infixToPost(String s, Map<Character, Integer> opr) {
		String result = "";
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '%' || s.charAt(i) == '/' || s.charAt(i) == '*') {
				if(stack.isEmpty() || opr.get(s.charAt(i)) > opr.get(stack.peek())) {
					stack.push(s.charAt(i));
				}
				else {
					System.out.print(stack.pop());
					while(!stack.isEmpty() && opr.get(s.charAt(i)) <= opr.get(stack.peek())) {
						System.out.print(stack.pop());
					}
					
					stack.push(s.charAt(i));
				}
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		
		return result;
	}

	private static Map<Character, Integer> init() {
	
		Map<Character, Integer> operators = new HashMap<Character, Integer>();

		operators.put('+', 1);
		operators.put('-', 1);
		operators.put('*', 2);
		operators.put('/', 2);
		operators.put('%', 2);
		
		
		return operators;
		
	}

}
