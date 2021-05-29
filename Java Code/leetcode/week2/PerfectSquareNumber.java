package com.leetcode.problems.may.week2;

/**
 * https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3324/
 * 
 * Given a positive integer num, write a function which returns True if num is a
 * perfect square else False.
 * 
 * Follow up: Do not use any built-in library function such as sqrt.
 * 
 * @author kenarayan
 *
 */

public class PerfectSquareNumber {

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(49));
	}

	public static boolean isPerfectSquare(int num) {
		long sum = 0;
		for (int i = 1; sum < num; i = i + 2) {
			sum = sum + i;
			if (sum == num) {
				return true;
			}
		}
		return false;
	}

}
