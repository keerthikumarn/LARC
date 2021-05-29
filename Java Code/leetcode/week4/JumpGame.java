package com.leetcode.problems.april.week4;

public class JumpGame {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 1, 1, 4 };
		int[] arr1 = new int[] { 2, 0, 0, 1, 4 };
		System.out.println(canJump(arr));
		System.out.println(canJump(arr1));
	}

	public static boolean canJump(int[] nums) {
		int lastPos = nums.length - 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (i + nums[i] >= lastPos) {
				lastPos = i;
			}
		}
		return lastPos == 0;
	}
}
