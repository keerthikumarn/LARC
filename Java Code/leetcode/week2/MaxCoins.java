package com.leetcode.problems.july.week2;

public class MaxCoins {

	public static void main(String[] args) {
		int[][] coins = new int[][] { 
							{ 1, 1, 0 }, 
							{ 0, 0, 1 }, 
							{ 0, 0, 0 }, 
							{ 1, 0, 1 } };
		System.out.println(maxCoins(coins, coins.length, coins[0].length, 0, 0));
	}

	private static int maxCoins(int[][] coins, int m, int n, int row, int col) {
		if (row == m || col == n) {
			return 0;
		}

		if (row == m - 1 && col == n - 1) {
			return coins[row][col];
		}

		int rightMove = maxCoins(coins, m, n, row, col + 1);
		int downMove = maxCoins(coins, m, n, row + 1, col);
		return Math.max(rightMove, downMove) + coins[row][col];
	}

}
