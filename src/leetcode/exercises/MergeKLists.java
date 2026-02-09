package leetcode.exercises;

import java.util.PriorityQueue;

//LeetCode 23. Merge k sorted List
public class MergeKLists {

	public static void main(String[] args) {
//		lists = [[1,4,5],[1,3,4],[2,6]]
		ListNode node1 = new ListNode(1);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);

		ListNode node1_2 = new ListNode(1);
		ListNode node3 = new ListNode(3);
		ListNode node4_2 = new ListNode(4);

		ListNode node2 = new ListNode(2);
		ListNode node6 = new ListNode(6);

		node1.next = node4;
		node4.next = node5;
		node1_2.next = node3;
		node3.next = node4_2;
		node2.next = node6;
		ListNode[] lists = {node1, node1_2, node2};
		ListNode response = mergeKLists(lists);
			
		
//		mergeKLists(null);

	}
	
	 public static ListNode mergeKLists(ListNode[] lists) {

	        if (lists.length == 0) return null;
	        
	        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	        for (ListNode node: lists) {
	            while (node != null) {
	                minHeap.add(node.val);
	                node = node.next;
	            }
	            
	        }

	        // here we already have all list in the priority Queue
	        // now we will travers the  PQ
	        ListNode dummy = new ListNode(-1);
	        ListNode response = dummy;
	        while (!minHeap.isEmpty()) {
	            response.next = new ListNode(minHeap.remove());
	            response = response.next;

	        }

	        return dummy.next;

	        
	    }
	 
	 
	 
	 
	 public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }

}
