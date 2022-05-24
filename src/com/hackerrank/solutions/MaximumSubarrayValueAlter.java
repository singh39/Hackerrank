package com.hackerrank.solutions;

public class MaximumSubarrayValueAlter {

	public static void main(String[] args) {

		int arr[] = { -1, 2, 3, 4, -5 };

		System.out.println(findMaxSubarrayVal(arr));

	}

	private static int findMaxSubarrayVal(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0)
				arr[i] = (-1) * arr[i];
		}

		int maxSum = maximumSubarraySum(arr);
		int minSum = minimumSubarraySum(arr);
		int result = Math.max(maxSum, (-1) * minSum);

		return result * result;

	}

	private static int maximumSubarraySum(int arr[]) {

		int curr_sum = 0, sum_so_far = 0;

		for (int i = 0; i < arr.length; i++) {
			curr_sum = arr[i];

			if (curr_sum > sum_so_far)
				sum_so_far = curr_sum;
			if (curr_sum < 0)
				curr_sum = 0;
		}
		
		return sum_so_far;
	}

	private static int minimumSubarraySum(int arr[]) {

		int curr_sum = Integer.MAX_VALUE, sum_so_far = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(curr_sum > 0) 
				curr_sum = arr[i];
			else
				curr_sum += arr[i];
			
			sum_so_far = Math.min(curr_sum, sum_so_far);
		}
		
		return sum_so_far;
	}

}
