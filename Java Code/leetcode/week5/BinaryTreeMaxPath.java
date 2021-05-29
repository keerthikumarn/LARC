package com.leetcode.problems.april.week5;

public class BinaryTreeMaxPath {

	private static int maxSumPath = Integer.MIN_VALUE;

	public static void main(String[] args) {

	}

	public static int maxPathSum(TreeNode root) {
		findPathSum(root);
		return maxSumPath;
	}

	public static int findPathSum(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int leftNodeValue = Math.max(0, findPathSum(node.left));
		int rightNodeValue = Math.max(0, findPathSum(node.right));
		maxSumPath = Math.max(maxSumPath, leftNodeValue + rightNodeValue + node.val);
		return Math.max(leftNodeValue, rightNodeValue) + node.val;
	}

}
