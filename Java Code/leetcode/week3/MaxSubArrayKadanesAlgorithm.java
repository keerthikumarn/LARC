package com.leetcode.problems.may.week3;

public class MaxSubArrayKadanesAlgorithm {

	public static void main(String[] args) {
		// System.out.println(maxSubArrayKadane(new int[] { -2, 1, -3, 4, -1, 2,
		// 1, -5, 4 }));
		// System.out.println(maxSubArrayKadane(new int[] { -2, -1 }));
		System.out.println(maxSubarraySumCircular(new int[] { 1, 2, -3, 4 }));
	}

	public static int maxSubarraySumCircular(int[] A) {
		int max = maxSubArray(A);
		int count = 0;

		for (int i = 0; i < A.length; i++) {
			count = count + A[i];
			A[i] *= -1;
		}
		count = count + maxSubArray(A);
		return Math.abs(count) < Math.abs(max) ? max : count;
	}

	// Kadane's algo for max sub array
	public static int maxSubArray(int[] arr) {
		int finalSum = arr[0];
		int currSum = arr[0];
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			if (currSum + arr[i] < arr[i]) {
				currSum = arr[i];
			} else {
				currSum = currSum + arr[i];
			}
			if (currSum > finalSum) {
				finalSum = currSum;
			}
		}
		return finalSum;
	}

}
