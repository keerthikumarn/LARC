package com.leetcode.problems.may.week1;

/**
 * https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3317/
 * 
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is 
 * considered a different type of stone from "A".
 * 
 * @author kenarayan
 */

import java.util.HashMap;
import java.util.Map;

public class StonesAndJewels {

	public static void main(String[] args) {
		String J = "aA";
		String S = "aAAbbbb";
		System.out.println(numJewelsInStones(J, S));
	}

	public static int numJewelsInStones(String J, String S) {
		if (J.length() == 0 || S.length() == 0) {
			return 0;
		}
		int jLen = J.length();
		int sLen = S.length();
		Integer value = new Integer(0);
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < sLen; i++) {
			if (!map.containsKey(S.charAt(i))) {
				map.put(S.charAt(i), 1);
			} else {
				map.put(S.charAt(i), map.get(S.charAt(i)) + 1);
			}
		}

		for (int idx = 0; idx < jLen; idx++) {
			if (map.containsKey(J.charAt(idx))) {
				value = value + map.get(J.charAt(idx));
			}
		}

		return value.intValue();
	}

}
