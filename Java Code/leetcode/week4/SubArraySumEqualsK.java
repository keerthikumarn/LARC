package com.leetcode.problems.april.week4;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {

	public static void main(String[] args) {

	}

	public int subarraySum(int[] nums, int k) {
		if(nums == null || nums.length == 0){
			return 0;
		}
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		int result = 0;
		int sum = 0;
		int len = nums.length;
		for(int i = 0; i < len; i++) {
			sum += nums[i];
			
			if(map.containsKey(sum - k)){
				result = result + map.get(sum - k);
			}
			
			//map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		
		return result;

	}

}
