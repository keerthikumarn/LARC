package com.leetcode.problems.april.week3;

public class ConstructBSTPreorder {

	public static void main(String[] args) {
		int[] arr = new int[] { 8, 5, 1, 7, 10, 12 };
		TreeNode node = bstFromPreorder(arr);
		printBST(node);
	}

	private static void printBST(TreeNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.val + " ");
		printBST(node.left);
		printBST(node.right);
	}

	public static TreeNode bstFromPreorder(int[] preorder) {
		if (preorder == null || preorder.length == 0) {
			return null;
		}
		int len = preorder.length;
		TreeNode bTree = new TreeNode(preorder[0]);
		if (len == 1) {
			return bTree;
		}

		for (int i = 1; i < len; i++) {
			constructBST(bTree, preorder[i]);
		}
		return bTree;
	}

	public static void constructBST(TreeNode node, int val) {
		if (node.val < val) {
			if (node.right == null) {
				node.right = new TreeNode(val);
			} else {
				constructBST(node.right, val);
			}
		} else {
			if (node.left == null) {
				node.left = new TreeNode(val);
			} else {
				constructBST(node.left, val);
			}
		}
	}

}
