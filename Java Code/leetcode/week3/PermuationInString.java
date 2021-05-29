package com.leetcode.problems.may.week3;


/**
 * https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/536/week-3-may-15th-may-21st/3333/
 * 
 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, 
 * one of the first string's permutations is the substring of the second string.
 * 
 * @author kenarayan
 *
 */
public class PermuationInString {

	public static void main(String[] args) {

	}

	public boolean checkInclusion(String s1, String s2) {
		boolean isInclusion = Boolean.FALSE;
		if (s2 == null || s2.length() == 0) {
			return s2.equals(s1);
		}
		if (s1.length() > s2.length()) {
			return false;
		}

		int[] charS1Count = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			charS1Count[s1.charAt(i) - 'a']++;
		}
		for (int i = 0; i <= s2.length() - s1.length(); i++) {
			int[] charS2Count = new int[26];
			for (int j = 0; j < s1.length(); j++) {
				charS2Count[s2.charAt(i + j) - 'a']++;
			}
			if (matches(charS1Count, charS2Count))
				isInclusion = Boolean.TRUE;
		}

		return isInclusion;
	}

	public boolean matches(int[] charS1Count, int[] charS2Count) {
		boolean result = Boolean.TRUE;
		for (int i = 0; i < 26; i++) {
			if (charS1Count[i] != charS2Count[i]) {
				result = Boolean.FALSE;
			}
		}
		return result;
	}

}
