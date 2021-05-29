package com.leetcode.problems.april.week1;

public class MoveZeros {

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
		print(nums);
	}

	public static void moveZeroes(int[] nums) {
		int len = nums.length;
		int temp = 0;
		int count = 0;
		if (len == 0) {
			return;
		}
		
		for (int i = 0; i < len; i++) {
			if(nums[i] != 0){
				nums[count++] = nums[i];
			}
		}
		while(count < len){
			nums[count++] = 0;
		}
		/*for (int i = 0; i < len; i++) {
			if (nums[i] != 0) {
				temp = nums[count];
				nums[count] = nums[i];
				nums[i] = temp;
				count++;
			}
		}*/
	}

	public static void print(int[] nums) {
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
