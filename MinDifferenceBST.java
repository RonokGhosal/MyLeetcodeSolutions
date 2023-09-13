import javax.imageio.metadata.IIOMetadata;
import javax.print.DocFlavor;
import java.util.Scanner;

public class MinDifferenceBST {
	private static  Scanner scanner;
	private static Integer prev;
	private static int minDiff;

  public static class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
      }
  }

  public static TreeNode createNode()

	{
		TreeNode node = null;
		scanner = new Scanner(System.in);
		System.out.println("Enter the data");
		int data = scanner.nextInt();
		if (data == -1) {
			return null;
		}
		node = new TreeNode(data);
		System.out.println("Enter left node for " + data);
		node.left = createNode();
		System.out.println("Enter right node for " + data);
		node.right = createNode();
		return node;
	}


	public static void  inOrderTraversal(TreeNode root) {
  	if (root == null) return ;
	inOrderTraversal(root.left);
	if (prev != null) {
		minDiff = Math.min(minDiff, Math.abs(root.val - prev));
		System.out.println("Minmum Difference between nodes is " + minDiff);
	}
     prev = root.val;
	inOrderTraversal(root.right);

	}

		public static  int getMinimumDifference(TreeNode root) {

			prev = null;
			minDiff = Integer.MAX_VALUE;
			inOrderTraversal(root);
			System.out.println("Minmum Difference between nodes is " + minDiff);
			return minDiff;
		}

	public static void main(String[] args) {

		TreeNode treenode = createNode();

		int minDiff = getMinimumDifference(treenode);
		System.out.println("Minmum Difference between nodes is " + minDiff);

	}
	}

