package com.hackerrank.solutions;

public class RotateArray {

	public static void main(String[] args) {
		// Method 1

		int arr[] = { 10, 20, 30, 40, 50 };
		int k = 2;
		rotate(arr, k, arr.length);
		
		
		// Method 2

		int nums[] = { 10, 20, 30, 40, 50 };
		
		if (k > nums.length)

		{
			k = k % nums.length;
		}

		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);

	}

	private static void rotate(int arr[], int d, int n) {
		for (int i = 0; i < d; i++)
			rotatebyOne(arr, n);

		printArray(arr);
	}

	private static void rotatebyOne(int arr[], int n) {
		int i, temp;
		temp = arr[1];
		for (i = 1; i < n - 1; i++)
			arr[i] = arr[i + 1];
		arr[n - 1] = temp;
	}

	private static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

}
