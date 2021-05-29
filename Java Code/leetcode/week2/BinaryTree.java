package com.leetcode.problems.july.week2;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
	TreeNode root;

	/* Method to calculate the diameter and return it to main */
	int diameter(TreeNode root) {
		if (root == null)
			return 0;

		int lheight = height(root.left);
		int rheight = height(root.right);

		int ldiameter = diameter(root.left);
		int rdiameter = diameter(root.right);

		return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter)) - 1;

	}

	int diameter() {
		return diameter(root);
	}

	static int height(TreeNode node) {
		if (node == null)
			return 0;

		return (1 + Math.max(height(node.left), height(node.right)));
	}
	
	public int widthOfBinaryTree1(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        return dfs(root, 1, 0, list);
    }

	private int dfs(TreeNode root, int id, int level, List<Integer> list) {
		if (root == null) {
			return 0;
		}
		if (level == list.size()) {
			list.add(id);
		}
		return Math.max(id + 1 - list.get(level),
				Math.max(dfs(root.left, id * 2, level + 1, list), dfs(root.right, id * 2 + 1, level + 1, list)));
	}

	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(3);
		tree.root.right = new TreeNode(2);
		tree.root.left.left = new TreeNode(5);
//		tree.root.left.right = new TreeNode(5);

		System.out.println("The diameter of given binary tree is : " + tree.diameter());
	}
}