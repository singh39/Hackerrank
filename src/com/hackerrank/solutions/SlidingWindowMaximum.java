package com.hackerrank.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,3,1,4,5,7,2,4,6};
		int k = 3;
		System.out.println(getKMaxElements(arr, k));

	}

	private static List<Integer> getKMaxElements(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
		PriorityQueue<Integer> que = new PriorityQueue<Integer>(Collections.reverseOrder());
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i < k; i++) {
			que.add(arr[i]);
		}
		
		for(int i = k; i <= n; i++) {
			
			result.add(que.peek());
			System.out.println(que);
			que.remove(arr[i-k]);
			que.add(arr[i%n]);
		}
		
		return result;
	}

}
