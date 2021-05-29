package com.leetcode.problems.july.week3;

import java.util.StringTokenizer;

/**
 * https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/
 * week-3-july-15th-july-21st/3391/
 * 
 * Given an input string, reverse the string word by word.
 * 
 * @author kenarayan
 *
 */
public class ReverseStringsByWords {

	public static void main(String[] args) {
		reverseWords("a good   example");
	}

	public static String reverseWords(String s) {
		String[] strArr = s.trim().split("\\s+");
		int len = strArr.length;
		StringBuilder sb = new StringBuilder();
		for(int i = len - 1; i >=0; i--) {
	        sb.append(strArr[i]).append(" ");
	    }
		System.out.println(sb.toString().trim());
		return sb.toString().trim();
	}
}
