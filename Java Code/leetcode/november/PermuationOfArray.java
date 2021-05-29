package com.leetcode.problems.november;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/explore/featured/card/november-leetcoding-challenge/565/
 * week-2-november-8th-november-14th/3528/
 * 
 * @author kenarayan
 *
 */
public class PermuationOfArray {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 };
		permuteUnique(nums);
	}

	public static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		findPermutations(list, new ArrayList<Integer>(), nums, new boolean[nums.length]);
		return list;
	}

	private static void findPermutations(List<List<Integer>> resultList, ArrayList<Integer> numsList, int[] nums,
			boolean[] visited) {
		if (numsList.size() == nums.length) {
			resultList.add(new ArrayList<Integer>(numsList));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (visited[i] || i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
					continue;
				}
				visited[i] = true;
				numsList.add(nums[i]);
				findPermutations(resultList, numsList, nums, visited);
				visited[i] = false;
				numsList.remove(numsList.size() - 1);
			}
		}
	}

}
