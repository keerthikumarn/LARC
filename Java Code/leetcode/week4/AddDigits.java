package com.leetcode.problems.july.week4;

public class AddDigits {

	public static void main(String[] args) {
		System.out.println(addDigits(147));
	}

	public static int addDigits(int num) {
		if (num == 0) {
			return 0;
		}
		System.out.println(num+" % 9 = "+ num% 9);
		return num % 9 != 0 ? num % 9 : 9;
	}

}
