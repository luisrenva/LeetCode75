package leetcode.exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {

//		[3,9,20,null,null,15,7]
		TreeNode tree = new TreeNode(3);
		tree.left = new TreeNode(9);
		tree.right = new TreeNode(20);
		tree.right.left = new TreeNode(15);
		tree.right.right = new TreeNode(7);

		List<List<Integer>> res = levelOrder(tree);
		res.forEach(a -> System.out.println(a));

	}

	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();

		if (root == null) {
			return res;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root); // [3,9,20,null,null,15,7]. the size always when we start is 1 because we are in
							// root

		while (!queue.isEmpty()) { // [0] = [3,9,20,null,null,15,7]
			List<Integer> currentLevel = new ArrayList<>();
			// instead to use other queue is not empty we read the size to avoid errors with
			// null
			// for the second iteration we have [9, 20] we took the values from left and
			// right
			int size = queue.size();
			for (int i = 0; i < size; i++) { // [0]= [3,9,20,null,null,15,7]
				// here we will remove the value and insert in the currentLevel list the to the
				// response
				TreeNode currentNode = queue.remove(); // now the queu is empty

				if (currentNode != null) {
					currentLevel.add(currentNode.value); // here I will have the 3
					// if(currentNode.left != null) {
					queue.add(currentNode.left); // read valeu to next level
					// }
					// if(currentNode.right != null) {
					queue.add(currentNode.right); // read value to next level
					// }
				}
			}

			if (currentLevel.size() > 0) {
				res.add(currentLevel); // first we insert the [3],
			}

		}
		return res;
	}

}