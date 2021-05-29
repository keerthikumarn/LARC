package com.leetcode.problems.may.week1;


/**
 * 
 * https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3322/
 * 
 * In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
 * Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
 * We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
 * Return true if and only if the nodes corresponding to the values x and y are cousins.
 * 
 *  @author kenarayan
 * 
 */
public class CousinsInBinaryTree {

	public static void main(String[] args) {

	}

	class Pair {
		TreeNode parent;
		int level;

		Pair(TreeNode parent, int level) {
			this.parent = parent;
			this.level = level;
		}
	}

	public boolean isCousins(TreeNode root, int x, int y) {
		Pair left = getValidPair(root, x, null, 0);
		Pair right = getValidPair(root, y, null, 0);
		if(left.level == right.level && left.parent != right.parent) {
			return true;
		}
		return false;
	}
	
	public Pair getValidPair(TreeNode root, int val, TreeNode parent, int level){
		if(root == null) {
			return null;
		}
		
		if(root.val == val) {
			return new Pair(parent, level);
		}
		
		Pair left = getValidPair(root.left, val, root, level + 1);
		Pair right = getValidPair(root.right, val, root, level + 1);
		return left == null ? right : left;
	}

}
