
import java.util.Scanner;

public class MaxDepthTree {
	static Scanner scanner = new Scanner(System.in);

	public static class TreeNode {
		TreeNode left;
		TreeNode right;
		int val;

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {
		TreeNode root = createTree();
		int depth = maxDepth(root) ;
		System.out.println("Depth of the treenode is " + depth);
	}


	public static TreeNode createTree() {
		TreeNode root = null;
		System.out.println("Enter data for node");
		int data = scanner.nextInt();
		if (data==-1) {
			return null;
		}
		root = new TreeNode(data);
		System.out.println("Enter data for left  node" + data);
		root.left = createTree();
		System.out.println("Enter data for right  node" + data);
		root.right = createTree();
		return root;
	}


	public static int maxDepth(TreeNode root) {
		if (root == null) return 0;
		return(Math.max(maxDepth(root.left),maxDepth(root.right) ) + 1 );
	}
}