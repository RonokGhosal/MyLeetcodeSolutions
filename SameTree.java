import java.util.Scanner;

public class SameTree {

	static Scanner scanner = new Scanner(System.in) ;
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

  public  static TreeNode createNode() {
	  TreeNode treeNode = null;
	  System.out.println("Enter root data");
	  int data = scanner.nextInt();
	  if (data==-1) {
		  return null;
	  } else {
		  treeNode = new TreeNode(data);
	  }
	  System.out.println("Enter left node data for " + data);
	  treeNode.left = createNode();
	  System.out.println("Enter right node data for " + data);
	  treeNode.right = createNode();
	  return treeNode;
  }

	public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q== null) {
        	return true;
        } else
        	if (p == null && q!=null || q == null && p != null) {
        		return false;
	        } else
	        if( p!=null && q !=null && p.val != q.val)	 {
	        	return false;
	        } else {
	        	return (isSameTree( p.left,  q.left)  && isSameTree( p.right,  q.right));
	        }
        }

        public static void main(String[] args) {
	      TreeNode p = createNode();
	      TreeNode q = createNode();
	      System.out.println(isSameTree( p, q));
        }
}
