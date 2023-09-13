package DSA.Trees;

import com.sun.source.tree.Tree;
import com.sun.tools.javac.Main;
import medium.AddNumbers;
import org.w3c.dom.Node;

import javax.print.DocFlavor;
import java.lang.instrument.UnmodifiableClassException;
import java.net.PortUnreachableException;
import java.time.temporal.Temporal;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeCreate {

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
	}

	public static class  ListNode{
		int data;
		ListNode next;
	}
	public static TreeNode prev = new TreeNode();


	public static void main(String args[]) {
		TreeNode treeNode =  createNode();
		System.out.println("inOrderTraversal");
		inOrderTraversal(treeNode);
		System.out.println();
		System.out.println("PreOrderTraversal");
		PreOrderTraversal(treeNode);
		System.out.println();
		System.out.println("PreOrderTraversal");
		PostOrderTraversal(treeNode);
		System.out.println();
		System.out.println("Height of Tree");
		System.out.println(getHeightOfTree(treeNode));
		System.out.println("No of Edges of Tree");
		System.out.println(getEdgesOfTree(treeNode));
		System.out.println("Max Node Value of tree");
		System.out.println(getMaxTreeNodeValue(treeNode));
		System.out.println(getMaxNodeWithoutRecursion(treeNode));
		System.out.println(getMinNodeWithoutRecursion(treeNode));
		System.out.println("Min Node Value of tree");
		System.out.println(getMinTreeNodeValue(treeNode));
		System.out.println("Number of Nodes in the tree");
		System.out.println(sizeOfTree(treeNode));
		System.out.println(String.valueOf(isBSTValid(treeNode)));


	}


	public static TreeNode createNode() {
		TreeNode root = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter data");
		int input = scanner.nextInt();
		if (input == -1) {
			return null;
		} else {
			root = new TreeNode();
			root.data = input;
		}
		System.out.println("Enter data for left node for " + input);
		root.left = createNode();
		System.out.println("Enter data for right node for " + input);
		root.right = createNode();
		return root;
	}

	public static void inOrderTraversal(TreeNode node) {
		if (node == null) return ;
		inOrderTraversal(node.left);
		System.out.print(node.data + " ");
		inOrderTraversal(node.right);

	}
	public static void PreOrderTraversal(TreeNode root){
		if ( root == null ) return;
		System.out.print(root.data + " ");
		PreOrderTraversal(root.left);
		PreOrderTraversal(root.right);

	}

	public static void PostOrderTraversal(TreeNode root){

		if ( root == null ) return;
		PostOrderTraversal(root.left);
		PostOrderTraversal(root.right);
		System.out.print( root.data + " ");

	}

	public static int getHeightOfTree(TreeNode node) {
		if (node == null) return 0;
		int height = Math.max(getHeightOfTree(node.left) , getHeightOfTree(node.right)) + 1;
		return height;
	}

	public static int getEdgesOfTree(TreeNode node) {
		// is number opf nodes -1
     int nodes = sizeOfTree(node);
      return nodes -1 ;
	}

	public static int getMinNodeWithoutRecursion(TreeNode node) {
		if (node == null) return 0;
		TreeNode least = node;
		while (least.left!= null) {
				least = least.left;
		}
		return least.data;
	}

	public static int getMaxNodeWithoutRecursion(TreeNode node) {
		if (node == null) return 0;
		TreeNode max = node;
		while (max.right!= null) {
			max = max.right;
		}
		return max.data;
	}

	public static int getMaxTreeNodeValue(TreeNode node) {
		if ( node == null) {return Integer.MIN_VALUE ;}
		return Math.max(node.data, Math.max(getMaxTreeNodeValue(node.left), getMaxTreeNodeValue(node.right)));

	}

	public static int getMinTreeNodeValue(TreeNode node) {
		if( node == null) return Integer.MAX_VALUE;
		return Math.min(node.data, Math.min(getMinTreeNodeValue(node.left), getMinTreeNodeValue(node.right)));
	}

	public static int sizeOfTree(TreeNode node ) {
		if (node == null) return 0;
		return ( sizeOfTree(node.left )  + sizeOfTree(node.right) +1 );

	}

	public static void breadthTraversal( TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		if (root==null) return;
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			System.out.println(node.data);
			if(node.left!= null){
				queue.add(node.left);
			}
			if(node.right != null) {
			queue.add(node.right);
		}
	}

		}

	public static TreeNode getPrev() {
		return prev;
	}

	public static boolean isBSTValid (TreeNode node) {
		if (node==null) return true;

		if (!isBSTValid(node.left)) return false;
		TreeNode cur = node;
		if ( cur.data  <= getPrev().data) {
			return false;
		}
		prev = cur;
		return(isBSTValid(node.right));
	}

		public static TreeNode sortedListTo(ListNode head) {
		if( head == null ) {
			return null ;
		}

		ListNode midNode  = mid(head);
		TreeNode root = new TreeNode();
		root.data = head.data;
		if (midNode == head)  {
				return root;
		}
		root.left = sortedListTo(head);
		root.right = sortedListTo(midNode.next);
		return root;
		}


		private static  ListNode mid( ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next!= null  ) {
			slow = slow.next;
			fast = fast.next.next;

		}
          return slow;
		}
	}





