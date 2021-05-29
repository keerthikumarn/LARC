package com.leetcode.problems.may.week1;

/**
 * https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3320/
 * 
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * 
 * @author kenarayan
 *
 */

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("leetcode"));

	}

	public static int firstUniqChar(String s) {
		if(s.length() == 0) {
			return -1;
		}
		int len = s.length();
		
		for(int i = 0; i < len; i++){
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				return i;
			}
		}
		return -1;
	}

}
