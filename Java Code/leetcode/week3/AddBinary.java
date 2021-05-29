package com.leetcode.problems.july.week3;


/**
 * https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3395/
 * 
 * Given two binary strings, return their sum (also a binary string). The input
 * strings are both non-empty and contains only characters 1 or 0.
 * 
 * @author kenarayan
 *
 */
public class AddBinary {
	
	final static char zero = '0';

	public static void main(String[] args) {
		System.out.println(addBinary("11", "1"));
	}

	private static String addBinary(String a, String b) {
		int aLen = a.length() - 1;
		int bLen = b.length() - 1;
		StringBuilder resultStr = new StringBuilder();
		int carry = 0;
		while (aLen >= 0 || bLen >= 0) {
			int sum = 0;
			if (aLen >= 0) {
				sum = sum + a.charAt(aLen) - zero;
				aLen--;
			}
			if (bLen >= 0) {
				sum = sum + b.charAt(bLen) - zero;
				bLen--;
			}
			sum = sum + carry;
			resultStr.append(sum % 2);
			carry = sum / 2;
		}
		if (carry == 1) {
			resultStr.append(carry);
		}
		return resultStr.toString();
	}

}
