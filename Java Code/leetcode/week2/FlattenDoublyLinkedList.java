package com.leetcode.problems.july.week2;

/**
 * https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/
 * week-2-july-8th-july-14th/3386/
 * 
 * You are given a doubly linked list which in addition to the next and previous
 * pointers, it could have a child pointer, which may or may not point to a
 * separate doubly linked list. These child lists may have one or more children
 * of their own, and so on, to produce a multilevel data structure, as shown in
 * the example below.
 * 
 * Flatten the list so that all the nodes appear in a single-level, doubly
 * linked list. You are given the head of the first level of the list.
 * 
 * @author kenarayan
 *
 */

public class FlattenDoublyLinkedList {

	public static void main(String[] args) {

	}

	public Node flatten(Node head) {
		if (head == null) {
			return head;
		}
		// Start From the root node
		Node parent = head;
		while (parent != null) {
			/* Check the current/parent node has a child node */
			if (parent.child != null) {
				Node childNode = parent.child;
				/* Find the tail node of doubly linked list */
				while (childNode.next != null) {
					/* connect to the tail if child is not NULL */
					childNode = childNode.next;
				}
				childNode.next = parent.next;
				if (parent.next != null) {
					/* connect the parent with the child node */
					parent.next.prev = childNode;
				}
				parent.next = parent.child;
				parent.next.prev = parent;
				/* Remove the child node ref */
				parent.child = null;
			} else {
				/* If NO child exists, move on to next node */
				parent = parent.next;
			}
		}
		return head;
	}

}
