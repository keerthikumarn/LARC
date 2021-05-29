package com.leetcode.problems.may.week3;

public class FindAllAnagrams {

	public static void main(String[] args) {
		String str = "abc";
		int len = str.length();
		System.out.println(findAnagram(str, 0, len - 1));
	}

	private static String findAnagram(String str, int start, int end) {
		if (start == end)
			System.out.println(str);
		else {
			for (int i = start; i <= end; i++) {
				str = swap(str, start, i);
				findAnagram(str, start + 1, end);
				str = swap(str, start, i);
			}
		}
		return str;
	}

	public static String swap(String str, int i, int j) {
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
