public class MiddleOflInkedList {
   public static class ListNode {
       int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

   public static void main(String[] aargs) {
   	ListNode l1 = new ListNode(1);
	   ListNode l2 = new ListNode(2);
	   ListNode l3 = new ListNode(3);
	   ListNode l4 = new ListNode(4);
	   ListNode l5 = new ListNode(5);
	   l1.next = l2;
	   l2.next = l3;
	   l3.next = l4;
	   l4.next = l5;
	   l5.next = null;
	   ListNode mid = middleNode( l1);
	   System.out.println("Middle node vale is " + mid.val);


   }
	public static ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null  && fast.next != null ) {
			slow = slow.next;
			fast= fast.next.next;
		}
		return slow;
	}
}
