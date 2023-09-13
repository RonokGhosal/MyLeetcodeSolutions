import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InorderTraversal {
	static Scanner scanner = new Scanner(System.in);

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

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
		TreeNode tree = createTree();
		List<Integer> nodes = inorderTraversal(tree);
		for (Integer node: nodes) {
				System.out.print(node + "");

		}
		System.out.println();

	}

	public static TreeNode createTree() {
		TreeNode treeNode = null;
		System.out.println("Please enter the data");
		int data = scanner.nextInt();
		if (data == -1) return null;
		else {
			treeNode = new TreeNode(data);
		}
		System.out.println("Please enter left node for " + data);
		treeNode.left = createTree();
		System.out.println("Please enter right node for " + data);
		treeNode.right = createTree();
		return treeNode;
	}

	public static List<Integer> inorrderTraversalHelper(TreeNode root,List<Integer> treeNodes ) {
		if (root== null) return treeNodes;
		inorrderTraversalHelper(root.left, treeNodes);
		treeNodes.add(root.val);
		inorrderTraversalHelper(root.right,treeNodes);
		return treeNodes;
	}

	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> treeNodes = new ArrayList<>();
		List<Integer> treeNodesList = inorrderTraversalHelper(root,treeNodes );
		return treeNodesList;
	}
}
