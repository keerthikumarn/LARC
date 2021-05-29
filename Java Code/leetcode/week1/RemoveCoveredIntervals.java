package com.leetcode.problems.october.week1;

/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/
 * week-1-october-1st-october-7th/3483/
 * 
 * @author kenarayan
 *
 */
public class RemoveCoveredIntervals {

	public static void main(String[] args) {

	}

	public static int removeCoveredIntervals(int[][] intervals) {
		if (intervals.length == 0) {
			return 0;
		}
		int intervalCount = 0;
		int len = intervals.length;
		for (int i = 0; i < len; i++) {
			if (intervals[i] != null) {
				for (int j = 0; j < len; j++) {
					if (i != j && intervals[j] != null) {
						if (intervals[j][0] <= intervals[i][0] && intervals[i][1] <= intervals[j][1]) {
							intervals[i] = null;
							break;
						}
					}
				}
			}
		}
		for (int[] interval : intervals) {
			if (interval != null) {
				intervalCount++;
			}
		}
		return intervalCount;
	}

}
