package com.leetcode.problems.may.week1;

import java.util.Arrays;

/**
 * 
 * https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3321/
 * 
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 * @author kenarayan
 *
 */

public class MajorityElementInArray {

	public static void main(String[] args) {

	}

	public static int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

	public static int majorityElementMooreAlgo(int[] nums) {
		int candidate = 0;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				candidate = nums[i];
				count = 1;
			} else {
				if (nums[i] == candidate) {
					count++;
				} else {
					count--;
				}
			}
		}
		return candidate;
	}

}
