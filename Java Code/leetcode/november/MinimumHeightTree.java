package com.leetcode.problems.november;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumHeightTree {

	public static void main(String[] args) {
		int[][] edges = { { 1, 0 }, { 1, 2 }, { 1, 3 } };
		findMinHeightTrees(4, edges);
	}

	private static List<Integer> findMinHeightTrees(int n, int[][] edges) {
		List<Integer> mhtList = new ArrayList<Integer>();
		// when there are no edges !
		if (edges == null || edges.length == 0) {
			return mhtList;
		}
		// Start building a graph :-(
		Map<Integer, List<Integer>> graph = new HashMap<Integer, List<Integer>>();
		buildTreeGraph(edges, graph);
		return getListOfMHT(graph, n);
	}

	private static List<Integer> getListOfMHT(Map<Integer, List<Integer>> graph, int n) {
		List<Integer> leafList = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			if(graph.get(i).size() == 0) {
				leafList.add(i);
			}
		}
		
		//should execute only nodes > 2
		while(n > 2) {
			n = n - leafList.size();
			List<Integer> newLeaves = new ArrayList<>();
			for(int leaf: leafList){
	            int neighbor = graph.get(leaf).iterator().next();
	            graph.get(neighbor).remove(leaf);
	            if(graph.get(neighbor).size()==1){
	                newLeaves.add(neighbor);
	            }
	        }
			leafList = newLeaves;
		}
		return leafList;
	}

	private static void buildTreeGraph(int[][] edges, Map<Integer, List<Integer>> graph) {
		for (int[] edge : edges) {
			int from = edge[0];
			int to = edge[1];
			// Add edges in forward manner
			if (!graph.containsKey(from)) {
				List<Integer> neighbors = new ArrayList<>();
				neighbors.add(to);
				graph.put(from, neighbors);
			} else {
				List<Integer> neighbors = graph.get(from);
				neighbors.add(to);
				graph.put(from, neighbors);
			}

			// Add edges in reverse manner
			if (!graph.containsKey(to)) {
				List<Integer> neighbors = new ArrayList<>();
				neighbors.add(from);
				graph.put(to, neighbors);
			} else {
				List<Integer> neighbors = graph.get(to);
				neighbors.add(from);
				graph.put(to, neighbors);
			}
		}
	}
}
