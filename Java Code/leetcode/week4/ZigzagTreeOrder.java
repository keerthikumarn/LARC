package com.leetcode.problems.july.week4;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ZigzagTreeOrder {

	public static void main(String[] args) {

	}

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (root == null) {
			return res;
		}
		Deque<TreeNode> deque = new LinkedList<>();
		deque.add(root);
		while (!deque.isEmpty()) {
			List<Integer> current = new LinkedList<>();
			int qSize = deque.size();
			for (int i = 0; i < qSize; i++) {
				TreeNode node = deque.removeFirst();
				if (res.size() % 2 == 0) {
					current.add(node.val);
				} else {
					current.add(0, node.val);
				}

				if (node.left != null)
					deque.add(node.left);
				if (node.right != null)
					deque.add(node.right);
			}
			res.add(current);
		}
		return res;
	}
}
