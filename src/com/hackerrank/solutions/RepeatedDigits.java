package com.hackerrank.solutions;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RepeatedDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 11;
		int n2 = 15;
		int result = 0;
		
		for (int i = n1; i < n2 + 1; i++) 
	    {
	  
	        // Add 1 to the answer if i has 
	        // no repeated digit else 0 
			result = result + repeatedDigits(i);
	    }
	  
	    System.out.println(result);

	}

	private static int repeatedDigits(int n) {

		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		
		while (n != 0) {
			int d = n % 10;
			if (s.contains(d)) {
				return 0;
			}
			s.add(d);
			n = n / 10;
		}
		return 1;

	}

}
