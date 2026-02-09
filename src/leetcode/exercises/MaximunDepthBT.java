package leetcode.exercises;

/**
   Given the root of a binary tree, return its maximum depth.
   A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
   Input: root = [3,9,20,null,null,15,7]
   Output: 3
 */
		
public class MaximunDepthBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree = new TreeNode(3);
		tree.left = new TreeNode(9);
		tree.right = new TreeNode(20);
		
		tree.right.left = new TreeNode(15);
		tree.right.right = new TreeNode(7);
		tree.right.right.right = new TreeNode(19);
		tree.right.right.right.right = new TreeNode(20);
		int result = maxDepth(tree);
		System.out.println("Result:  "+result);

	}
	
	public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int left = maxDepth(root.left);
        
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;

        
    }
	

}
