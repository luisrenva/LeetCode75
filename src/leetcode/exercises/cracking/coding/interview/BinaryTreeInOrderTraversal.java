package leetcode.exercises.cracking.coding.interview;

import java.util.ArrayList;
import java.util.List;

import leetcode.exercises.TreeNode;

/**
 * Given 2 binary trees , determine whether they have the same inorder traversal
 *   Tree 1                  Tree 2
 *   
 *     5						3
 *    / \					   / \
 *   3   7					  1   6
 *  /   /						 / \
 * 1   6						5   7
 *   
 */
public class BinaryTreeInOrderTraversal {

	public static void main(String[] args) {
		TreeNode tree1 = new TreeNode(5);
		tree1.left = new TreeNode(3);
		tree1.left.left = new TreeNode(1);
		tree1.right = new TreeNode(7);
		tree1.right.left = new TreeNode(6);
		
		TreeNode tree2 = new TreeNode(3);
		tree2.left = new TreeNode(1);
		tree2.right = new TreeNode(6);
		tree2.right.left = new TreeNode(5);
		tree2.right.right = new TreeNode(7);
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		inOrderTraversal(tree1, list1);
		inOrderTraversal(tree2, list2);
		
		System.out.println("The 2 trees have same inorder traversal: "+list1.equals(list2));

		
	}
	
	public static void inOrderTraversal(TreeNode node, List<Integer> list ) {
		if (node == null) return;
		// inOrder is left root and right
		inOrderTraversal(node.left, list);
		list.add(node.value);
		inOrderTraversal(node.right, list);
		
	}


}


//class TreeNode {
//	int value;
//	TreeNode left;
//	TreeNode right;
//	
//	public TreeNode(int value) {
//		this.value = value;
//	}
//}