package com.leetcode.problems.july.week3;

public class WordSearch {

	private static boolean[][] isCellVisited;

	public static void main(String[] args) {
		char[][] board = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		System.out.println(exist(board, "SEE"));
	}

	private static boolean exist(char[][] board, String word) {
		if (board == null || board.length == 0) {
			return false;
		}
		isCellVisited = new boolean[board.length][board[0].length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0) && findNextChar(board, word, i, j, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean findNextChar(char[][] board, String word, int row, int col, int k) {
		if (word.length() == k) {
			return true;
		}

		if (row < 0 || row >= board.length || col < 0 || col >= board[row].length || board[row][col] != word.charAt(k)
				|| isCellVisited[row][col]) {
			return false;
		}

		isCellVisited[row][col] = true;

		if (findNextChar(board, word, row + 1, col, k + 1) || findNextChar(board, word, row - 1, col, k + 1)
				|| findNextChar(board, word, row, col + 1, k + 1) || findNextChar(board, word, row, col - 1, k + 1)) {
			return true;
		}
		isCellVisited[row][col] = false;
		return false;
	}

}
