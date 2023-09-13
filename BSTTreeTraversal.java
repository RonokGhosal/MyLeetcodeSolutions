import org.w3c.dom.Node;

import java.util.Scanner;

public class BSTTreeTraversal {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Node node = createTree();
		inOrder(node);
		System.out.println();
		preOrder(node);
		System.out.println();
		postOrder(node);

	}


	public static  Node createTree() {
		Node root = null;
		System.out.println("Enter = data");
		int data = scanner.nextInt();
		if ( data == -1) return null;
        root = new Node(data);
		System.out.println("Enter left  for " + data);
        root.left = createTree();
		System.out.println("Enter right  " + data);
		root.right = createTree();
		return root;
	}

	public  static void preOrder(Node root) {
		if ( root == null) return;
         System.out.print(root.data + " ");
         preOrder( root.left);
		 preOrder( root.right);
	}
	public static  void inOrder(Node root) {
		if ( root == null) return;
		inOrder( root.left);
		System.out.print(root.data + " ");
		inOrder( root.right);
	}
	public static  void postOrder(Node root) {
		if ( root == null) return;
		postOrder( root.left);
		postOrder( root.right);
		System.out.print(root.data + " ");
	}

	public static class Node {
		Node left;
		Node right;
		int data;
		public Node(int data) {
          this.data = data;
		}
	}
}



