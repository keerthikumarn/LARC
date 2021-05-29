package com.leetcode.problems.october.week1;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/
 * week-1-october-1st-october-7th/3482/
 * 
 * @author kenarayan
 *
 */
public class KDiffPairs {

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 1, 4, 1, 5 };
		System.out.println(findPairs(nums, 2));
	}

	public static int findPairs(int[] nums, int k) {
		if(nums == null || nums.length == 0 || k < 0) {
			return 0;
		}
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			}else{
				map.put(nums[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> element : map.entrySet()) {
			int key = element.getKey();
			int value = element.getValue();
			int keyVal = key + k;
			
			if(k == 0 && value > 1) {
				count++;
			}else if (k != 0 && map.containsKey(keyVal)) {
				count++;
			}
		}
		return count;
	}

}
