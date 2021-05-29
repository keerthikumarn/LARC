package com.leetcode.problems.july.week2;

/**
 * https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/
 * week-2-july-8th-july-14th/3385/
 * 
 * Given a binary tree, write a function to get the maximum width of the given
 * tree. The width of a tree is the maximum width among all levels. The binary
 * tree has the same structure as a full binary tree, but some nodes are null.
 * 
 * The width of one level is defined as the length between the end-nodes (the
 * leftmost and right most non-null nodes in the level, where the null nodes
 * between the end-nodes are also counted into the length calculation.
 * 
 * @author kenarayan
 *
 */
public class MaxWidthOfBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(3);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(5);
		//root.left.right = new TreeNode(3);
		//root.right.right = new TreeNode(9);
		System.out.println(widthOfBinaryTree(root));
	}

	public static int widthOfBinaryTree(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftTreeHeight = getHeight(root.left);
		int rightTreeHeight = getHeight(root.right);

		int leftTreeDiameter = getDiameter(root.left);
		int rightTreeDiameter = getDiameter(root.right);
		return Math.max(leftTreeHeight + rightTreeHeight, Math.max(leftTreeDiameter, rightTreeDiameter));
	}

	private static int getDiameter(TreeNode node) {
		return widthOfBinaryTree(node);
	}

	private static int getHeight(TreeNode node) {
		if (node == null) {
			return 0;
		}
		return 1 + Math.max(getHeight(node.left), getHeight(node.right));
	}

}
