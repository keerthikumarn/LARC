package com.leetcode.problems.november;

public class ConsecutiveChars {

	public static void main(String[] ar) {
		String str = "raaghavvvv";
		System.out.println(maxPower(str));

	}

	private static int maxPower(String str) {
		int maxCount = 0;
		int i = 0;
		while (i < str.length()) {
			int currCount = 1;
			int j = i + 1;
			while (j < str.length() && (str.charAt(i) == str.charAt(j))) {
				j += 1;
				currCount += 1;
			}
			if (maxCount < currCount) {
				maxCount = currCount;
			}
			i = j;
		}
		return maxCount;
	}

}
