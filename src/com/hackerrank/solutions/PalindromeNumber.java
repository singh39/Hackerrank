package com.hackerrank.solutions;

public class PalindromeNumber {

	public static void main(String[] args) {

		int n = 56;
		int sum = 0;

		while (n > 0) {
			sum += (n % 10);
			n /= 10;
		}

		System.out.println(isPalindrome(sum));

	}

	private static boolean isPalindrome(int sum) {

		int div = 1;

		while (sum / div >= 10)
			div *= 10;

		while (sum != 0) {
			int head = sum / div;
			int tail = sum % 10;

			if (head != tail) {
				return false;
			}

			sum = (sum % div) / 10;

			div = div / 100;
		}

		return true;

	}

}
