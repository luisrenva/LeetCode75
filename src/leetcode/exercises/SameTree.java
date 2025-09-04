package leetcode.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		isSameTree(null, null);
	}
	
	
    public static boolean isSameTree(TreeNode p, TreeNode q) {
    	if (p == q) return true;

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        preOrder(p, list1);
        preOrder(q, list2);

        return list1.equals(list2);        
    }

    public static void preOrder (TreeNode node, List<Integer> list) {
    	 if (node == null) {
             list.add(null);
          } else {
              list.add(node.value);
              preOrder(node.left, list);
              preOrder(node.right, list);
          }
        
    }
}