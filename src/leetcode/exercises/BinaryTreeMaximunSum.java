package leetcode.exercises;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class BinaryTreeMaximunSum {

	
	static int test = Integer.MIN_VALUE;
	
	public static void main(String[] args) {

		TreeNode tree1 = new TreeNode(-10);
		tree1.left = new TreeNode(9);
		tree1.right = new TreeNode(20);
		
		tree1.right.left = new TreeNode(15);
		tree1.right.right = new TreeNode(7);


		System.out.println("The maximum path sum is: "+maxPathSum(tree1));

	}
	
	
    
    
    public static int maxPathSum(TreeNode root) {
    	
        
        	try {
				postOrder(root);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
        
        return test;
    }

    private static int postOrder(TreeNode node) throws Exception {
        //do I need to insert in my list or just create a sum int?
        if (node == null) return 0;

        
        int left = Math.max(postOrder(node.left), 0);
        int right = Math.max(postOrder(node.right),0);
        test = Math.max(test, left + right + node.value);
        
//        return 0;
        


        return Math.max(left, right) + node.value;
//        return  Collections.max(treeMap.values());
    }

}
