import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public  class LinkedList {
	public void add(LinkedList2.ListNode listNode) {
	}

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

	static class MyLinkedList {
		ListNode head;

		ListNode add(int val) {
			if (this.head==null) {
				ListNode newNode = new ListNode(val);
				this.head = newNode;

			} else {
				ListNode last = this.head;
				while (last.next!=null) {
					last = last.next;
				}
				ListNode newNode = new ListNode(val);
				last.next = newNode;
			}
			return head;

		}
	}


	public static void main(String[] args) {


		MyLinkedList linkedList1 = new MyLinkedList();
		linkedList1.add(1);
		linkedList1.add(2);
		linkedList1.add(3);
		ListNode last = linkedList1.head;
		while (last!=null) {
			System.out.print(last.val + " ");
			last = last.next;
		}
		System.out.println();


		MyLinkedList linkedList2 = new MyLinkedList();
		linkedList2.add(1);
		linkedList2.add(4);
		linkedList2.add(5);

		last = linkedList2.head;
		while (last!=null) {
			System.out.print(last.val + " ");
			last = last.next;
		}
		System.out.println();


		ListNode head3 = mergeTwoLists(linkedList1.head, linkedList2.head);
		last = head3;
		 while (last!=null) {
			System.out.print(last.val + " ");
			last = last.next;
		}
		System.out.println();
		/*last = linkedList2.head;
		while (last!=null) {
			System.out.print(last.val + " ");
			last = last.next;
		}
		System.out.println();*/


	}




	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode last1 = list1;
		ListNode last2 = list2;
		MyLinkedList ll = new MyLinkedList();

		if (list1==null) {
			return list2;
		} else if (list2==null) {
			return list1 ;
		} else {
			while (last1!=null && last2!=null) {
				if (last1.val <= last2.val) {
					System.out.println("Adding " + last1.val);
					ll.add(last1.val);
					last1 = last1.next;
				} else if (last1.val >= last2.val) {
					System.out.println("Adding " + last2.val);
					ll.add(last2.val);
					last2 = last2.next;
				}
			}

			if (last1 == null) {
				while (last2!=null) {
					ll.add(last2.val);
					last2 = last2.next;
				}
			} else {
					if (last2 == null) {
						while (last1 != null) {
							ll.add(last1.val);
							last1 = last1.next;
						}
					}
				}
			}

		return ll.head;
	}
}


