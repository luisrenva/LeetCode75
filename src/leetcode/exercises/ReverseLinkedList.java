package leetcode.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ReverseLinkedList {

	public static void main(String... args) {
//		[1,2,3,4,5]
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4, node5);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);
//		new ReverseLinkedList().reverseList(node1);
		ListNode test = reverseList(node1);

	}

	public static ListNode reverseList(ListNode head) {
		if (head == null)
			return null;

		ListNode previous = null;
		ListNode current = head;
		ListNode temp = new ListNode(-1, new ListNode());

		while (current != null) {

			temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;

		}

		return previous;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

}

;