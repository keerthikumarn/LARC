package com.leetcode.problems.may.week3;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/536/week-3-may-15th-may-21st/3332/
 * 
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
 * The order of output does not matter.
 * 
 * @author kenarayan
 *
 */

public class FindAnagrams {
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> rst = new ArrayList<>();
		if (s == null || s.length() == 0 || s.length() < p.length()) {
			return rst;
		}

		int[] charPCount = new int[26];
		int[] charSCount = new int[26];
		
		for (int i = 0; i < p.length(); i++) {
			charPCount[p.charAt(i) - 'a']++;
		}
		for (int i = 0; i < p.length(); i++) {
			charSCount[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s.length() - p.length(); i++) {
			if (isMatch(charPCount, charSCount)) {
				rst.add(i);
			}
			charSCount[s.charAt(i + p.length()) - 'a']++;
			charSCount[s.charAt(i) - 'a']--;
		}
		if (isMatch(charPCount, charSCount)) {
			rst.add(s.length() - p.length());
		}
		return rst;
	}

	private boolean isMatch(int[] arr1, int[] arr2) {
		int arr1Len = arr1.length;
		for (int i = 0; i < arr1Len; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
}
