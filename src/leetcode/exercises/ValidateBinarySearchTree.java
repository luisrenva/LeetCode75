package leetcode.exercises;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidateBinarySearchTree {

	static int mainRoot = 0;
//	static int left = 0;
//	static int right = 0;

	public static void main(String[] args) {
//		[5,1,4,null,null,3,6]
		//[2, 1, 3]
//		TreeNode tree = new TreeNode(5);
//		tree.left = new TreeNode(1);
//		tree.right = new TreeNode(4);
//		tree.right.left = new TreeNode(3);
//		tree.right.right = new TreeNode(6);
		
//		TreeNode tree = new TreeNode(1);
//		tree.left = new TreeNode(1);

		//		[5,4,6,null,null,3,7]
		TreeNode tree = new TreeNode(5);
		tree.left = new TreeNode(4);
		tree.right = new TreeNode(6);
		tree.right.left = new TreeNode(3);
		tree.right.right = new TreeNode(7);
		
		//[2, 1, 3]
//		TreeNode tree = new TreeNode(2);
//		tree.left = new TreeNode(1);
//		tree.right = new TreeNode(3);
//		
//		boolean res = preOrder(tree);
//		System.out.println(res);y
		
		
		

	}

	public static boolean inOrder(TreeNode node, Integer min, Integer max) {
		if (node == null) return true;
		
		if (node.value <= min || node.value >= max) return false;
		
		return inOrder(node.left, min, node.value) && inOrder(node.right, node.value, max);
//	}
//		boolean response = true;
//		int left = 0;
//		int right = 0;
//		
//		if (node == null) return false;
//		
//		//if coming [0, null, null]
//		if (node != null &&  node.left == null && node.right == null) return true;
//		
//		if (node != null && node.left.value < node.value && node.right == null) return true;
//		if (node != null && node.left.value <= node.value && node.right == null) return false;
//		if (node != null && node.right.value > node.value && node.left == null) return true;
//		if (node != null && node.right.value >= node.value && node.left == null) return false;
//
//		Stack<TreeNode> stack = new Stack<>();
//		stack.push(node);
//		int firstRoot = node.value; // 5
//
//
//		while (!stack.isEmpty()) {
//			TreeNode currentNode = stack.pop(); //[5,1,4,null,null,3,6]
//			
//			int rootValue = currentNode.value; // 5
//			
//			if (currentNode.left != null) {
//				left = currentNode.left.value; // 1
//				stack.push(currentNode.left);
//			}
//
//			if (currentNode.right != null) {
//				right = currentNode.right.value; // 4
//				stack.push(currentNode.right);			
//			}
//
//			if (currentNode.left != null && currentNode.right != null) {
//				if (left >= rootValue || right <= rootValue) {
//					return false;
//				}
//			}
//		}
//		
//		return true;
		
		//Using InOrder Traversal
		// left, root, right
//		if (node == null) return false;
//		
//		
//		
//		
//
//		
//		inOrder(node.left, Integer.MIN_VALUE, node.value);
//		inOrder(node.right, node.value, Integer.MAX_VALUE);
		
		
		
		
		
//		return true;

	}

}

