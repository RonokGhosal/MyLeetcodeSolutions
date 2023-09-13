import java.sql.SQLIntegrityConstraintViolationException;

public class RemoveDuplicatesfromLL {
	public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public static void main(String[] args) {
	  ListNode node1 = new ListNode(1);
	  ListNode node2 = new ListNode(2);
	  ListNode node3 = new ListNode(3);
	  node1.next = node2;
	  node2.next = node3;
	  node3.next = null;
	  ListNode newlist = deleteDuplicates(node1);
	  ListNode last = newlist;
	  while(last != null) {
	  	System.out.println(last.val);
		  last= last.next;
	  }
  }
	public  static ListNode deleteDuplicates(ListNode head) {
		ListNode last = head;

		while(last != null && last.next!= null) {
			if (last.val == last.next.val) {
				last.next = last.next.next;
			} else {
				last= last.next;
			}
		}
         return head;
	}
}
