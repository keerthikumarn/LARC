package com.leetcode.problems.july.week1;

public class IslandPerimeter {

	public static void main(String[] args) {
		
	}

	public int islandPerimeter(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int landCount = 0;
		int noOfEdges = 0;
		if(grid.length == 0) {
			return 0;
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(grid[i][j] == 1) {
					landCount++;
					if(i > 0 && grid[i - 1][j] == 1) {
						noOfEdges++;
					}
					if(j > 0 && grid[i][j - 1] == 1) {
						noOfEdges++;
					}
				}
			}
		}
		return landCount * 4 - noOfEdges * 2;
	}

}
