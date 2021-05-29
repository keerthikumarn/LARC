package com.leetcode.problems.april.week3;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4 };
		productExceptSelf(nums);
	}

	public static int[] productExceptSelf(int[] nums) {
		int len = nums.length;
		int tempNum = 1;
		int res[] = new int[len];
		for (int i = 0; i < len; i++) {
			res[i] = tempNum;
			tempNum = tempNum * nums[i];
		}
		tempNum = 1;
		for (int i = len - 1; i >= 0; i--) {
			res[i] = res[i] * tempNum;
			tempNum = tempNum * nums[i];
		}
		return res;
	}

}
