package com.leetcode.problems.april.week2;

public class BinaryTreeDiameter {

	private static int ans;

	public static void main(String[] args) {

	}

	public int diameterOfBinaryTree(TreeNode root) {

		findDepthOfBT(root);
		return ans - 1;
	}

	private static int findDepthOfBT(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = findDepthOfBT(root.left);
		int right = findDepthOfBT(root.right);
		ans = Math.max(ans, left + right + 1);
		return Math.max(left, right) + 1;
	}

}
