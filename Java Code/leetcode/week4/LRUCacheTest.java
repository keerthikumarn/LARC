package com.leetcode.problems.april.week4;

public class LRUCacheTest {

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		cache.put(1, 1);
		cache.put(2, 2);
		cache.get(2);
		cache.put(3, 3);
		cache.get(2);
	}

}
