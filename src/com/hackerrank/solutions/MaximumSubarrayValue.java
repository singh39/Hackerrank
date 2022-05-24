package com.hackerrank.solutions;

public class MaximumSubarrayValue {

	public static void main(String[] args) {

		int arr[] = { 1, -1, 1, -1, 1 };

		System.out.println(findMaxSubarrayVal(arr));

	}

	private static int findMaxSubarrayVal(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if(i % 2 != 0)
				arr[i] = (-1) * arr[i];
		}
		
		int result = getSubArraySum(arr, 0, 0, 0);
		
		return result;

	}

	static int getSubArraySum(int[] arr, int start, int end, int maxVal) {
		if (end == arr.length)
			return maxVal;

		else if (start > end)
			return getSubArraySum(arr, 0, end + 1, maxVal);

		else {
			int sum = 0;
			for (int i = start; i <= end; i++) {
				sum += arr[i];
			}
			
			if(maxVal < sum*sum)
				maxVal = sum*sum;
			
			return getSubArraySum(arr, start + 1, end, maxVal);
		}

	}
}
