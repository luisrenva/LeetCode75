package leetcode.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//  }
 


class SameTree {
	
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		
		TreeNode tree2 = new TreeNode(1);
		tree2.left = new TreeNode(2);
		tree2.right = new TreeNode(3);
		
		
		boolean response =isSameTree(tree, tree2);
		System.out.println("Response ::"+ response);
	}
	
	
    public static boolean isSameTree(TreeNode p, TreeNode q) {
//    	if (p == q) return true;
//
//        List<Integer> list1 = new ArrayList<Integer>();
//        List<Integer> list2 = new ArrayList<Integer>();
//
//        preOrder(p, list1);
//        preOrder(q, list2);
//
//        return list1.equals(list2);   
    	
    	if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        
        if (p.value != q.value) return false;
        
        return(isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    	
    }

//    public static void preOrder (TreeNode node, List<Integer> list) {
//    	 if (node == null) {
//             list.add(null);
//          } else {
//              list.add(node.value);
//              preOrder(node.left, list);
//              preOrder(node.right, list);
//          }
//        
//    }
}



