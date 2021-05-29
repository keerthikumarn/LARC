package com.leetcode.problems.july.week1;

/**
 * https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3381/
 * 
 * The Hamming distance between two integers is the number of positions at which
 * the corresponding bits are different.
 * 
 * Given two integers x and y, calculate the Hamming distance.
 * 
 * @author kenarayan
 *
 */
public class HammingDistance {
	public static void main(String[] ar) {
		System.out.println(hammingDistance(1, 4));
	}

	public static int hammingDistance(int x, int y) {
		int z = x ^ y;
		int count = 0;
		while (z != 0) {
			if ((z & 1) == 1) {
				count++;
			}
			z = z >> 1;
		}
		return count;
	}
}
