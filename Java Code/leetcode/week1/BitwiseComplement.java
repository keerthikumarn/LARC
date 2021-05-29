package com.leetcode.problems.october.week1;

public class BitwiseComplement {

	public static void main(String[] args) {
		System.out.println(bitwiseComplement(5));
	}

	public static int bitwiseComplement(int N) {
		String binStr = Integer.toBinaryString(N);
		char[] charArray = binStr.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '0') {
				charArray[i] = '1';
			} else if (charArray[i] == '1') {
				charArray[i] = '0';
			}
		}
		return Integer.parseInt(new String(charArray), 2);
	}

}
