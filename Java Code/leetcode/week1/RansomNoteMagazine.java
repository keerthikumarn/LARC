package com.leetcode.problems.may.week1;

/**
 * https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3318/
 * 
 * Given an arbitrary ransom note string and another string containing letters
 * from all the magazines, write a function that will return true if the ransom
 * note can be constructed from the magazines ; otherwise, it will return false.
 * 
 * Each letter in the magazine string can only be used once in your ransom note.
 * 
 * @author kenarayan
 *
 */

public class RansomNoteMagazine {

	public static void main(String[] args) {
		System.out.println(canConstruct("aa", "ab"));
		System.out.println(canConstruct("a", "b"));
		System.out.println(canConstruct("aa", "aab"));
		System.out.println(canConstruct("", ""));
		System.out.println(canConstruct("aa", ""));
		System.out.println(canConstruct("aba", "baa"));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		int[] count = new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			count[magazine.charAt(i) - 'a']++;
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			if (--count[ransomNote.charAt(i) - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}

}
