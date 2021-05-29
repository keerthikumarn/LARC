package com.leetcode.problems.april.week4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

	private int capacity;
	private Map<Integer, Integer> map;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		map = new LinkedHashMap<Integer, Integer>();
	}

	public int get(int key) {
		Integer value = this.map.get(key);
		if (value == null) {
			value = -1;
		} else {
			this.put(key, value);
		}
		System.out.println("GET : "+value);
		return value;
	}

	public void put(int key, Integer value) {
		if (this.map.containsKey(key)) {
			map.remove(key);
		} else if (this.map.size() == this.capacity) {
			Iterator<Integer> it = this.map.keySet().iterator();
			it.next();
			it.remove();
		}
		map.put(key, value);
	}
	
}
