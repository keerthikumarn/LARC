package com.leetcode.problems.april.week2;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
	
	public static void main(String[] args) {
		
	}
	
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        for (int stone: stones){
            pQueue.offer(stone);
        }
        while (pQueue.size() > 1){
            int a = pQueue.poll();
            int b = pQueue.poll();
            if (a > b){
                pQueue.offer(a - b);
            }
        }
        return pQueue.isEmpty() ? 0 : pQueue.poll();
	}

}
