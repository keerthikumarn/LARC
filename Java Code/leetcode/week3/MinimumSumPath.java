package com.leetcode.problems.april.week3;

public class MinimumSumPath {

	public static void main(String[] args) {
		int[][] arr = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println(minPathSum(arr));
	}

	public static int minPathSum(int[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}
		int rows = grid.length;
		int cols = grid[0].length;
		int[][] newArr = new int[rows][cols];
		newArr[0][0] = grid[0][0];

		for (int i = 1; i < rows; i++) {
			newArr[i][0] = newArr[i - 1][0] + grid[i][0];
		}
		for (int j = 1; j < cols; j++) {
			newArr[0][j] = newArr[0][j - 1] + grid[0][j];
		}

		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				newArr[i][j] = Math.min(newArr[i - 1][j], newArr[i][j - 1]) + grid[i][j];
			}
		}
		return newArr[rows - 1][cols - 1];
	}

}
