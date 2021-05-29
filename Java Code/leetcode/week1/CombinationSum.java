package com.leetcode.problems.october.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		int[] candidates = new int[] { 2, 3, 6, 7 };
		System.out.println(combinationSum(candidates, 7));
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		List<Integer> combList = new ArrayList<Integer>();
		if (candidates == null || candidates.length == 0) {
			return finalList;
		}
		//Sort the array
		Arrays.sort(candidates);
		backTrackArray(finalList, combList, candidates, 0, target);
		return finalList;
	}

	private static void backTrackArray(List<List<Integer>> finalList, List<Integer> combList, int[] candidates,
			int start, int target) {
		if (target == 0) {
			finalList.add(new ArrayList<>(combList));
			return;
		}
		for (int idx = start; idx < candidates.length; idx++) {
			if (candidates[idx] > target) {
				break;
			}
			combList.add(candidates[idx]);
			backTrackArray(finalList, combList, candidates, idx, target - candidates[idx]);
			combList.remove(combList.size() - 1);
		}

	}

}
