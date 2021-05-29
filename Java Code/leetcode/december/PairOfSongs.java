package com.leetcode.problems.december;

import java.util.HashMap;
import java.util.Map;

public class PairOfSongs {

	public static void main(String[] ar) {
		int[] arr = new int[] { 418, 204, 77, 278, 239, 457, 284, 263, 372, 279, 476, 416, 360, 18 };
		System.out.println(numPairsDivisibleBy60(arr));

	}

	private static int numPairsDivisibleBy60(int[] time) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		if (null != time && time.length == 1) {
			return 1;
		}

		int len = time.length;

		for (int i = 0; i < len; i++) {
			for (int j = 60; j < 1000; j += 60) {
				if (map.containsKey(j - time[i])) {
					count += map.get(j - time[i]);
				}
			}
			if (map.get(time[i]) != null) {
				map.put(time[i], map.get(time[i]) + 1);
			} else {
				map.put(time[i], 0);
			}
		}
		return count;
	}

}
