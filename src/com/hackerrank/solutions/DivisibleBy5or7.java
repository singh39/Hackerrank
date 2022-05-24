package com.hackerrank.solutions;

public class DivisibleBy5or7 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int n = 20;
		
		for(int i = 0; i < n; i++) {
			if(i % 5 == 0 || i % 7 == 0)
				System.out.print(i + " ");
		}
	}

}
