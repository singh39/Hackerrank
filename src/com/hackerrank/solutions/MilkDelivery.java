package com.hackerrank.solutions;

public class MilkDelivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int morning[] = {10,17,12};
		int evening[] = {11,9,24};
		
		System.out.println(getMinFine(morning,evening, 4));

	}

	private static int getMinFine(int[] morning, int[] evening, int fine) {
		
		int n = morning.length;
		int min = Integer.MAX_VALUE; 
		for(int i = 0; i < n; i++) {
			int x = 0;

			for(int j = 0; j < 3; j++) {
				if((morning[j] + evening[((i+j)%n)] - 24) > 0)
					x += (morning[j] + evening[((i+j)%n)] - 24);
			}
			System.out.println(x);
			if(x < min)
				min = x;
		}
		
		return min*fine;
		
	}

}
