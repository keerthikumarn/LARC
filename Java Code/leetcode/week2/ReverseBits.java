package com.leetcode.problems.july.week2;

/**
 * https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/
 * week-2-july-8th-july-14th/3388/
 * 
 * Reverse bits of a given 32 bits unsigned integer.
 * 
 * @author kenarayan
 *
 */
public class ReverseBits {

	public static void main(String[] args) {
		reverseBits(43261596);
	}

	private static int reverseBits(int n) {
		return Integer.reverse(n);
	}
}
