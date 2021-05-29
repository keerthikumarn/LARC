package com.leetcode.problems.april.week3;

public class NumberOfIslands {

	public static void main(String[] args) {

	}
	
	int[][] matrix = null;
	int noOfIslands = 1;

	public int numIslands(char[][] grid) {
		int len = grid.length;
		if (grid == null || grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
		matrix = new int[grid.length][grid[0].length];
		for(int i = 0; i < len; i++){
			for(int j = 0; j < grid[0].length; j++){
				noOfIslands = isVisited(i, j, grid) ? ++noOfIslands : noOfIslands;
			}
		}
		return noOfIslands;
	}

	private boolean isVisited(int i, int j, char[][] grid) {
		if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length) {
			if (matrix[i][j] == 0 && grid[i][j] == '1') {
				matrix[i][j] = noOfIslands;
				isVisited(i - 1, j, grid);
				isVisited(i + 1, j, grid);
				isVisited(i, j + 1, grid);
				isVisited(i, j - 1, grid);
				return true;
			}
		}
		return false;
	}

}
