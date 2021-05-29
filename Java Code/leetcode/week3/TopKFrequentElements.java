package com.leetcode.problems.july.week3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/
 * week-3-july-15th-july-21st/3393/
 * 
 * Given a non-empty array of integers, return the k most frequent elements.
 * 
 * @author kenarayan
 *
 */
public class TopKFrequentElements {

	public static void main(String[] args) {
		topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2);
	}

	private static int[] topKFrequent(int[] nums, int k) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		final Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : nums) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		Queue<Integer> maxHeap = new PriorityQueue<Integer>(nums.length, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return map.get(o2) - map.get(o1);
			}
		});

		for (int num : map.keySet()) {
			maxHeap.add(num);
			if (maxHeap.size() > k) {
				maxHeap.poll();
			}
		}

		int[] top = new int[k];
		for (int i = k - 1; i >= 0; --i) {
			top[i] = maxHeap.poll();
		}
		return top;
	}
	

}

