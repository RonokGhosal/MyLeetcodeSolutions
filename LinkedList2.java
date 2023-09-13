import java.util.LinkedList;

public class LinkedList2 {
	public static class ListNode {
		private int val;
		private ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

		public static void main(String[] args) {
			ListNode list1 = new ListNode(2);
	     	ListNode head1 = list1;
		/*	head1 = add(head1,2);
			head1 = add(head1,4);*/

			ListNode last = head1;
			while (last!=null) {
				System.out.print(last.val + " ");
				last = last.next;
			}
			System.out.println();


			ListNode list2 = new ListNode(1);
			ListNode head2 = list2;
			/*head2 = add(head2,3);
			head2 = add(head2,4);*/

			last = head2;
			while (last!=null) {
				System.out.print(last.val + " ");
				last = last.next;
			}
			System.out.println();
			ListNode head3 = mergeTwoLists(head1, head2);
			last = head3;
			while (last!=null) {
				System.out.print(last.val + " ");
				last = last.next;
			}
			System.out.println();
		}

   public static int count(ListNode head) {
		ListNode last = head ;
		int count = 0;
		while(last !=null) {
			count++;
			last = last.next;
		}
		return count;
   }

	public static ListNode add(ListNode head , int val) {

		if (head == null) {
			ListNode newNode = new ListNode(val) ;
			newNode.next = null;
			head = newNode;
		} else {
			ListNode last = head;
			while(last.next != null) {
				last = last.next;
			}
			ListNode newNode = new ListNode(val) ;
			newNode.next = null;
			last.next= newNode;
		}
        return head;
	}

		public static ListNode mergeTwoLists( ListNode list1, ListNode list2) {
			ListNode last1 = list1;
			ListNode last2 = list2;
			ListNode list3 = null;
			ListNode head = list3;

			if (list1==null) {
				return list2;
			} else if (list2==null) {
				return list1;
			}
			else {
				while (last1!=null && last2!=null) {

					   if (last1.val <= last2.val) {
						 head = add(head, last1.val);
						 last1 = last1.next;

					} else if (last1.val >= last2.val) {
						head = add(head, last2.val);
						last2 = last2.next;
					}
				}
			}

			//if (last1 == null & last2 != list2 ) {
			if (last1 == null & count(list2) != 0 ) {
					System.out.println("Inside list1 is now NULL");
					while (last2!= null) {
						//ListNode newNodeNext  = new ListNode(last2.val);
						head = add(head,last2.val);
						last2 = last2.next;
					}
				} else {
				//	if (last2 == null & last1 != list1) {
				if (last2 == null && count(list1) != 0) {
						System.out.println("Inside list2 is now NULL");
						while (last1!=null) {
							  head = add(head,last1.val);
							 last1 = last1.next;
						}
					}
				}

			return head;
		}

}
