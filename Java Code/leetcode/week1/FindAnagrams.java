package com.leetcode.problems.april.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnagrams {

	public static void main(String[] args) {
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		groupAnagrams(arr);

	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0) {
			return null;
		}
		List<List<String>> anagramList = new ArrayList<List<String>>();
		Map<Integer, List<String>> valuesMap = new HashMap<Integer, List<String>>();

		for (String word : strs) {
			int sum = 0;
			for (char ch : word.toCharArray())
				sum += ch;
			if (valuesMap.containsKey(sum))
				valuesMap.get(sum).add(word);
			else {
				List<String> list = new ArrayList<String>();
				list.add(word);
				valuesMap.put(sum, list);
			}
		}

		for (List<String> list : valuesMap.values()) {
			anagramList.add(list);
		}
		return anagramList;

	}
	
	public List<List<String>> groupAnagrams1(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }

	/*private static boolean isAnagram(String string1, String string2) {
		if (string1.length() != string2.length()) {
			return false;
		}
		char[] s1 = string1.toLowerCase().toCharArray();
		char[] s2 = string2.toLowerCase().toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		return Arrays.equals(s1, s2);
	}*/

}
