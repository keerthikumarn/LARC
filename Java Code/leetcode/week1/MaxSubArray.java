package com.leetcode.problems.april.week1;

public class MaxSubArray {

	public static void main(String[] args) {
//		int[] arr = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int[] arr = new int[] { -2, -1};
		System.out.println(maxSubArray(arr));
		System.out.println(maxSubArrayKadane(arr));
		System.out.println(maxSubArray1(arr));
	}

	public static int maxSubArray(int[] nums) {
		int start = nums[0];
		int end = nums[0];
		int len = nums.length;
		for (int i = 1; i < len; i++) {
			end = end + nums[i];
			end = Math.max(end, nums[i]);
			start = Math.max(start, end);
		}
		return start;
	}
	
	/**
	 * Again Kadane's new approach
	 */
	public static int maxSubArray1(int[] nums) {
		int bestSum = nums[0]; // initial largest num in the array !!
		int bestStart = 0;
		int bestEnd = 0;
		int currentSum = 0;
		int currentStart = 0;
		int len = nums.length;
		if(len == 1){
			return nums[0];
		}
		
		for (int i = 0; i < len; i++) {
			currentSum = currentSum + nums[i];
			if (currentSum < 0) {
				currentSum = 0;
				currentStart = i + 1;
			} else if (currentSum > bestSum) {
				bestSum = currentSum;
				bestStart = currentStart;
				bestEnd = i;
			}
		}
		System.out.println("Best Sum : "+bestSum);
		return bestSum;
	}
		
		
	/**
	 * By using Kadane's algorithm which obeys O(n) complexity
	 * @param nums
	 * @return
	 */
	public static int maxSubArrayKadane(int[] nums) {
		int start = nums[0];
		int end = nums[0];
		int arrSize = nums.length;
		for (int i = 0; i < arrSize; i++) {
			if(end + nums[i] < nums[i]){
				end = nums[i];
			}else{
				end = end + nums[i];
			}
			if(end > start){
				start = end;
			}
		}
		return start;
	}
	
}
