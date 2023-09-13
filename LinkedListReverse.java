public   class LinkedListReverse {
   public  static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

   public static void main ( String[] args) {
	   ListNode node1 = new ListNode(1);
	   ListNode node2 = new ListNode(2);
	   ListNode node3 = new ListNode(3);
	   node1.next = node2;
	   node2.next = node3;
	   node3.next = null;

	   ListNode lastnode = node1;
	   while(lastnode != null) {
		   System.out.println(lastnode.val  + " ") ;
		   lastnode = lastnode.next;
	   }

	   ListNode noderev = reverseList( node1);
	   ListNode last = noderev;
	   while(last != null) {
	   	System.out.println(last.val  + " ") ;
	   	last = last.next;
	   }

   }

		public static ListNode reverseList(ListNode head) {
			ListNode prev = null;
			ListNode current = head;
			while(current !=null) {
				ListNode next = current.next;
				current.next = prev;
				prev = current;
				current = next;
		}
			return prev;
	}
}
