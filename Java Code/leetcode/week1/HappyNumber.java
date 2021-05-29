package com.leetcode.problems.april.week1;

public class HappyNumber {

	public static void main(String[] args) {
		int num = 82;
		int result = num;
		System.out.println(isHappy(result));
	}

	private static boolean isHappy(int result) {
		boolean isHappyNum = false;
		while (result != 1) {
			result = isHappyNumber(result);
		}
		if (result == 1) {
			isHappyNum = true;
		} 
		return isHappyNum;
	}

	private static int isHappyNumber(int n) {
		int sum = 0;
		int rem = 0;
		while (n > 0) {
			rem = n % 10;
			sum = sum + (rem * rem);
			n = n / 10;
		}
		return sum;
	}

}
