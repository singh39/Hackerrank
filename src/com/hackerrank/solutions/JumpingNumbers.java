package com.hackerrank.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class JumpingNumbers {

	public static void main(String[] args) {

		long X = 10067;
		System.out.println(getJumpingNumber(X));		

	}
	
	private static long getJumpingNumber(long x) {
		long max = Long.MIN_VALUE;
		for (long i = 0; i <= 9 && i < x; i++) {
			Queue<Long> q = new LinkedList<Long>();

			q.add(i);

			while (!q.isEmpty()) {
				long num = q.peek();
				q.poll();

				if (num <= x) {
					long last_digit = num % 10;
					max = (max < num) ? num : max; 
					
					if (last_digit == 0)
						q.add((num * 10) + (last_digit + 1));
					else if (last_digit == 9)
						q.add((num * 10) + (last_digit - 1));
					else {
						q.add((num * 10) + (last_digit - 1));
						q.add((num * 10) + (last_digit + 1));
					}
					
				}
			}
		}
		
		return max;
		
	}


}
