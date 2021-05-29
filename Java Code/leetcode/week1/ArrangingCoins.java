package com.leetcode.problems.july.week1;

/**
 * 
 * https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/544/
 * week-1-july-1st-july-7th/3377/
 * 
 * You have a total of n coins that you want to form in a staircase shape, where
 * every k-th row must have exactly k coins.
 * 
 * Given n, find the total number of full staircase rows that can be formed.
 * 
 * n is a non-negative integer and fits within the range of a 32-bit signed
 * integer.
 * 
 * @author kenarayan
 *
 */
public class ArrangingCoins {

	public static void main(String[] args) {
		System.out.println(arrangeCoins(10));
	}
	
	public static int arrangeCoins(int n) {
        return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5);
    }

}
