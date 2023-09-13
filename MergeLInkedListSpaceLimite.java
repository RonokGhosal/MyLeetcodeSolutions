public class MergeLInkedListSpaceLimite {

		public static class ListNode {
			private int val;
			private ListNode next;
            ListNode(){}
			ListNode(int val) {
				this.val = val;
				this.next = null;
			}
		}

		public static void main(String[] args) {
			ListNode list1 = new ListNode(1);
			ListNode list1head = list1;
			ListNode list2 = new ListNode(2);
			ListNode list3 = new ListNode(3);
			list1.next = list2;
			list2.next = list3;
			while (list1!=null) {
				System.out.print(list1.val);
				list1 = list1.next;
			}
			System.out.println();

			ListNode list4 = new ListNode(1);
			ListNode list4head = list4;
			ListNode list5 = new ListNode(3);
			ListNode list6 = new ListNode(4);
			list4.next = list5;
			list5.next = list6;
			while (list4!=null) {
				System.out.print(list4.val);
				list4 = list4.next;
			}
			System.out.println();


			if ( list4head == null) {
				System.out.println("Sending NULL list4 ");
			} else {

					System.out.println("Sending NON_NULL list4 ");
				}

			ListNode mergeNode = mergeTwoLists(list1head, list4head);
			if (mergeNode==null) {
				System.out.print("MergeNode is null");
			} else {
				while (mergeNode!=null) {
					System.out.print(mergeNode.val);
					mergeNode = mergeNode.next;
				}
			}
		}


	 public static ListNode mergeTwoLists(ListNode list1 , ListNode list2) {
       ListNode tmp = new ListNode(0);
       ListNode currNode = tmp;
       if( list1 == null ) {
       	return list2;
       }
		 if( list2 == null ) {
			 return list1;
		 }
		while(list1 !=null && list2 != null) {
			if (list1.val < list2.val) {
				currNode.next = list1;
				list1 = list1.next;
			} else {
				currNode.next = list2;
				list2 = list2.next;
			}
			currNode = currNode.next;
		}

		if (list1 == null) {
			currNode.next = list2;
			list2 = list2.next;
		} else if (list2== null) {
			currNode.next = list1;
			list1 = list1.next;

		}

		return tmp.next;
      }

	}
