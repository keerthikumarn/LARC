package com.leetcode.problems.april.week1;

import java.util.ArrayList;
import java.util.List;

public class CountingElements {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3 };
		// int[] arr = new int[] { 1, 1, 3, 3, 5, 5, 7, 7 };
		// int[] arr = new int[] { 1, 3, 2, 3, 5, 0 };
		//int[] arr = new int[] { 1, 1, 2, 2 };
		System.out.println(countElements(arr));
	}

	public static int countElements(int[] arr) {
		if(arr == null || arr.length <= 0){
			return 0;
		}
		int count = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int ele = 0; ele < arr.length; ele++) {
			list.add(arr[ele]);
		}
		for (int num : list) {
			int x = num + 1;
			if (list.contains(x)) {
				count++;
			}
		}
		return count;
	}

}
