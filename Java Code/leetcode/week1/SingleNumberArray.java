package com.leetcode.problems.april.week1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SingleNumberArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 1, 2, 1, 2, 5 };
		int size = arr.length;
		int result = arr[0]; // 1st element of the array to be compared with the rest of the elements in the array
		for (int i = 1; i < size; i++) {
			result = result ^ arr[i];
		}
		System.out.println(result);
		System.out.println(singleNumber(arr));
		System.out.println(singleNumber1(arr));
	}

	private static int singleNumber(int[] nums){
		Set<Integer> set = new HashSet<Integer>();
		for(int num : nums) {
			if(!set.add(num)){
				set.remove(num);
			}
		}
		Iterator<Integer> result = set.iterator();
		return result.next();
	}
	
	private static int singleNumber1(int[] nums){
		List<Integer> list = new ArrayList<Integer>();
		for(int num : nums){
			if(!list.contains(num)){
				list.add(num);
			}else{
				list.remove(num);
			}
		}
		return list.get(0);
	}
}
