package com.leetcode.problems.july.week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber {

	public static void main(String[] args) {
		singleNumber2(new int[] { 1, 2, 1, 3, 2, 5 });
	}

	/*public int[] singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap();
		for (int num : nums)
			map.put(num, map.getOrDefault(num, 0) + 1);

		int[] result = new int[2];
		int count = 0;
		for (Map.Entry<Integer, Integer> element : map.entrySet()) {
			if (element.getValue() == 1) {
				result[count++] = element.getKey();
			}
		}
		return result;
	}*/
	
	private static List<Integer> singleNumber2(int[] nums){
		List<Integer> list = new ArrayList<Integer>();
		for(int num : nums){
			if(!list.contains(num)){
				list.add(num);
			}else{
				list.remove(num);
			}
		}
		return list;
	}

}
