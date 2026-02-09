package leetcode.exercises;

public class TreeSum {
	
	static int response=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		
		System.out.println(sum(tree));

	}
	
	private static int sum(TreeNode node) {
		if (node == null) return 0;
		
		
//		response = response + node.value;
		
//		sum(node.left);
//		sum(node.right);
//		return response;
		
		return node.value + sum(node.left) + sum(node.right);
	}
	
	

}
