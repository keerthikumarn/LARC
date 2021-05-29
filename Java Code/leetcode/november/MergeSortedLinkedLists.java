package com.leetcode.problems.november;

public class MergeSortedLinkedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// Lets define the base cases
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode headNode; 
		
		/* initialize the ListNode with least element */
		if (l1.value < l2.value) {
			headNode = l1;
			l1 = l1.next;
		} else {
			headNode = l2;
			l2 = l2.next;
		}
		
		/* Initializing the currNode of new List */
		ListNode currNode = headNode;
		
		/** Logic to sort the 2 ListNodes **/
		while (l1 != null && l2 != null) {
			if (l1.value < l2.value) {
				currNode.next = l1;
				l1 = l1.next;
			} else {
				currNode.next = l2;
				l2 = l2.next;
			}
			currNode = currNode.next;
		}
		
		/* If l1 has elements, then add the same to new list*/
		if (l1 != null) {
			currNode.next = l1;
		}

		/* If l2 has elements, then add the same to new list*/
		if (l2 != null) {
			currNode.next = l2;
		}
		return headNode;
	}
	
	
	public ListNode mergeTwoListsInPlace(ListNode l1, ListNode l2) {
		// Lets define the base cases
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		
		ListNode headNode; 
		
		/* initialize the ListNode with least element */
		if (l1.value < l2.value) {
			headNode = l1;
			l1 = l1.next;
		} else {
			headNode = l2;
			l2 = l2.next;
		}
		
		ListNode currNode = headNode;
		
		while (l1 != null && l2 != null) {
			if (l1.value < l2.value) {
				currNode.next = l1;
				l1 = l1.next;
			} else {
				currNode.next = l2;
				l2 = l2.next;
			}
			currNode = currNode.next;
		}
		
		/* If l1 has elements, then add the same to new list*/
		if (l1 != null) {
			currNode.next = l1;
		}

		/* If l2 has elements, then add the same to new list*/
		if (l2 != null) {
			currNode.next = l2;
		}
		return headNode;
	}
}
