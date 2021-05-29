package com.leetcode.problems.july.week4;

import java.util.ArrayList;
import java.util.List;

public class TestHacker {

	public static void main(String[] args) {
		// int a = print();
		int[] range = new int[] { 4, 6 };
		List<Integer> list = getNumbersFromStartToEnd(range[0], range[1]);
		System.out.println(list.size());
	}

	private static List<Integer> getNumbersFromStartToEnd(int start, int end) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = start; i <= end; i++) {
			list.add(i);
		}
		return list;
	}

	private static void print() {
		System.out.println("hello");
	}

}
