package com.leetcode.problems.july.week2;

import java.util.ArrayList;

/**
 * https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3387/
 * 
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 * Note: The solution set must not contain duplicate subsets.
 * 
 * @author kenarayan
 */

import java.util.List;

public class SubSets {

	public static void main(String[] args) {
		//System.out.println(subsets(new int[] { 1, 2, 3 }));
		generateSubsets(new int[] { 1, 2, 3 });
	}

	public static List<List<Integer>> subsets(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(new ArrayList<Integer>());
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			int resultListSize = result.size();
			for (int j = 0; j < resultListSize; j++) {
				List<Integer> element = new ArrayList<>(result.get(j));
				element.add(nums[i]);
				result.add(element);
			}
		}
		return result;
	}
	
	public static void generateSubsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		generateSubsetsRecursively(nums, 0, new ArrayList<Integer>(), result);
		print(result);
	}

	private static void generateSubsetsRecursively(int[] nums, int n, List<Integer> subset, List<List<Integer>> result) {
		result.add(new ArrayList<>(subset));
		for(int i = n ; i < nums.length; i++){
			subset.add(nums[i]);
			generateSubsetsRecursively(nums, i + 1, subset, result);
			subset.remove(subset.size() - 1);
		}
	}
	
	private static void print(List<List<Integer>> result) {
		System.out.println(result);
	}

}
