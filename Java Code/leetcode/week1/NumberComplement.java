package com.leetcode.problems.may.week1;

/**
 * https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3319/
 * 
 * Given a positive integer num, output its complement number. The complement
 * strategy is to flip the bits of its binary representation.
 * 
 * @author kenarayan
 *
 */

public class NumberComplement {

	public static void main(String[] args) {
		System.out.println(findComplement(5));
	}

	public static int findComplement(int num) {
		int result = ((Integer.highestOneBit(num) - 1) << 1) + 1;
		return result ^ num;
	}

}
