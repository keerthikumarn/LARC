package com.leetcode.problems.april.week2;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 1 };
		System.out.println(findMaxLength(nums));
	}
	
	public static int findMaxLength(int[] nums) {
		int len = nums.length;
		int maxlen = 0;
		int count = 0;
		if(nums == null || len == 0) {
			return 0;
		}
		Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
		counts.put(0, -1);
		for(int i = 0; i < len; i++){
			if(nums[i] == 0){
				count += -1;
			}else{
				count += 1;
			}
			if(counts.containsKey(count)){
				maxlen = Math.max(maxlen, i - counts.get(count));
			}else{
				counts.put(count, i);
			}
		}
		return maxlen;
	}

	public static int findMaxLength1(int[] nums) {
		int maxlen = 0;
		int len = nums.length;
		for (int start = 0; start < len; start++) {
			int zerosCount = 0;
			int onesCount = 0;
			for (int end = start; end < len; end++) {
				if (nums[end] == 0) {
					zerosCount++;
				} else {
					onesCount++;
				}
				if (zerosCount == onesCount) {
					maxlen = Math.max(maxlen, end - start + 1);
				}
			}
		}
		return maxlen;
	}

}
