package com.leetcode.problems.july.week1;

/**
 * https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/544/
 * week-1-july-1st-july-7th/3382/
 * 
 * Given a non-empty array of digits representing a non-negative integer, plus
 * one to the integer.
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list, and each element in the array contain a single digit.
 * 
 * You may assume the integer does not contain any leading zero, except the
 * number 0 itself.
 * 
 */

public class PlusOne {

	public static void main(String[] args) {
		//int[] digits = new int[] {1, 2, 3};
		int[] digits = new int[] {4, 3, 2, 1};
		System.out.println(plusOne(digits));
		for(int num : digits) {
			System.out.println(num);
		}
	}

	private static int[] plusOne(int[] digits) {
		int len = digits.length;
		for (int i = len - 1; i >= 0; i--) {
			// Check if every array element is not digit 9. If so just increment
			// the value by 1
			if (digits[i] != 9) {
				digits[i]++;
				break;
			} else {
				// if 9, then set the arr element value to 0
				digits[i] = 0;
			}
			if (digits[0] == 0) {
                digits = new int[len + 1];
				digits[0] = 1;
				return digits;
			}
		}
		return digits;
	}

}
