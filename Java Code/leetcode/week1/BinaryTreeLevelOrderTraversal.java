package com.leetcode.problems.july.week1;

/**
* https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3378/
* 
* Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
*
* For example:
* Given binary tree [3,9,20,null,null,15,7],
*    3
*   / \
*  9  20
*    /  \
*   15   7
*/

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {

	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		levelOrder(root, results, 0);
		return results;
	}

	private void levelOrder(TreeNode root, List<List<Integer>> results, int level) {
		if (root == null) {
			return;
		}

		List<Integer> current = new ArrayList<Integer>();
		if (results.size() <= level) {
			current.add(root.val);
			results.add(0, current);
		} else {
			current = results.get(results.size() - level - 1);
			current.add(root.val);
		}

		levelOrder(root.left, results, level + 1);
		levelOrder(root.right, results, level + 1);
	}

}
