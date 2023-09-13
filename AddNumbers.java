package medium;

public  class AddNumbers {
	public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
  public static  void main( String[] args) {
	  ListNode l1 = new ListNode(2);
	  ListNode l2 = new ListNode(4);
	  ListNode l3 = new ListNode(6);
	  l1.next = l2;
	  l2.next = l3;
	  l3.next = null;
	  ListNode h1 = l1;
	  System.out.println();
	  ListNode l4 = new ListNode(5);
	  ListNode l5 = new ListNode(6);
	  ListNode l6 = new ListNode(4);
	  l4.next = l5;
	  l5.next = l6;
	  l6.next = null;
	  ListNode h2 = l4;

	  System.out.println();
	  ListNode ret = addTwoNumbers(h1, h2);
	  while(ret != null) {
	  	System.out.println(ret.val);
	  	ret = ret.next;
	  }
  }

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
		ListNode resultHead = new ListNode(0);
		ListNode l3 = resultHead;
		int carry =0;
		while(l1 != null || l2 != null || carry > 0 ) {
			int l1_num = (l1!=null) ? l1.val : 0;
			int l2_num = (l2!=null) ? l2.val : 0;
			int sum = l1_num + l2_num + carry;
			carry = sum / 10;
			int last_digit = sum % 10;
			ListNode newNode = new ListNode(last_digit);
			l3.next = newNode;
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
			l3=l3.next;
		}
		return resultHead.next;

		}

	}

