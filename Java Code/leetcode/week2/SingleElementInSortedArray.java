package com.leetcode.problems.may.week2;

/**
 * https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3327/
 * 
 * You are given a sorted array consisting of only integers where every element
 * appears exactly twice, except for one element which appears exactly once.
 * Find this single element that appears only once.
 * 
 * @author kenarayan
 *
 */
public class SingleElementInSortedArray {

	public static void main(String[] args) {
		// int[] arr = new int[] { 1, 1, 2, 2, 3, 4, 4, 8, 8 };
		int[] arr = new int[] { 1, 1, 2 };
		System.out.println(singleNonDuplicate(arr));
	}

	public static int singleNonDuplicate(int[] nums) {
		int count = 0;
		while (count < nums.length - 1) {
			if (nums[count] != nums[count + 1]) {
				return nums[count];
			}
			count = count + 2;
		}
		return nums[count];
	}

}
