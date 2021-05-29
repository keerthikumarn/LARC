package com.leetcode.problems.april.week2;

public class BackSpaceStringCompare {

	public static void main(String[] args) {
		String str1 = "ab#c";
		String str2 = "ad#c";
		System.out.println(backspaceCompare(str1, str2));
	}

	public static boolean backspaceCompare(String S, String T) {
		if (S == null || S.length() <= 0 || T == null || T.length() <= 0) {
			return false;
		}
		String s1 = removeHashFromString(S);
		String s2 = removeHashFromString(T);
		return s1.equals(s2);
	}

	private static String removeHashFromString(String str) {
		char HASH = '#';
		StringBuilder sb = new StringBuilder();
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == HASH) {
				if (sb.length() > 0) {
					sb.deleteCharAt(sb.length() - 1);
				}
			} else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

}
