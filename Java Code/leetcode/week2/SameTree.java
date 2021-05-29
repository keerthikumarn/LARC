package com.leetcode.problems.july.week2;

import com.leetcode.problems.july.week2.TreeNode;

/**
 * https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/
 * week-2-july-8th-july-14th/3389/
 * 
 * Given two binary trees, write a function to check if they are the same or
 * not.
 * 
 * Two binary trees are considered the same if they are structurally identical
 * and the nodes have the same value.
 * 
 * @author kenarayan
 *
 */
public class SameTree {

	public static void main(String[] args) {

	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if ( (p == null && q != null) || (p != null && q == null)) {
			return false;
		}
		
        if (p == null || q == null) {
			return true;
		}
		if (p == null && q != null || q == null && p != null) {
			return false;
		}
		if (p.val != q.val) {
			return false;
		}
        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);
        
		return left && right;
	}

}
