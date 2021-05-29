package com.leetcode.problems.may.week2;

/**
 * https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3328/
 * 
 * Given a non-negative integer num represented as a string, remove k digits
 * from the number so that the new number is the smallest possible. Note: The
 * length of num is less than 10002 and will be ≥ k.The given num does not
 * contain any leading zero.
 * 
 * @author kenarayan
 *
 */

public class RemoveKDigits {

	public static void main(String[] args) {

	}

	public String removeKdigits(String num, int k) {
		if(num.length() == k) {
			return "0";
		}
		StringBuilder sb = new StringBuilder(num);
		for(int i = 0; i < k; i++) {
			int idx = 0;
			while(idx < sb.length() - 1 && sb.charAt(idx) <= sb.charAt(idx + 1)) {
				idx++;
			}
			sb.delete(idx, idx + 1);
		}
        //chop off any leading zeros
		while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.delete(0, 1);
        }
        
        if (sb.length() == 0) {
            return "0";
        }
        return sb.toString();
	}
}
