package com.leetcode.problems.october.week1;


/**
 * https://leetcode.com/explore/featured/card/november-leetcoding-challenge/564/week-1-november-1st-november-7th/3517/
 * @author kenarayan
 *
 */
public class InsertionSortList {
	ListNode sortedNode = null;

	public ListNode insertionSortList(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode currNode = head;
		while (currNode != null) {
			ListNode nextNode = currNode.next;
			performInsertionSort(currNode);
			currNode = nextNode;
		}
		head = sortedNode;
		return head;
	}

	private void performInsertionSort(ListNode currNode) {
		if (sortedNode == null || sortedNode.val >= currNode.val) {
			currNode.next = sortedNode;
			sortedNode = currNode;
		} else {
			ListNode current = sortedNode;
			while (current.next != null && current.next.val < currNode.val) {
				current = current.next;
			}
			currNode.next = current.next;
			current.next = currNode;
		}
	}
}
