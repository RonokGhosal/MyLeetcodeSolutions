import java.lang.invoke.ConstantBootstraps;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CyclicLinkedList {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		ListNode list1 = new ListNode(3);
		ListNode head = list1;
		ListNode list2 = new ListNode(2);
		ListNode list3 = new ListNode(0);
		ListNode list4 = new ListNode(4);
		list1.next = list2;
		list2.next = list3;
		list3.next = list4;
		//list4.next = list2;

		boolean isCyclic = hasCycle(head);
		System.out.println("list node is clyclic  " + isCyclic);
	}

	public static boolean hasCycle(ListNode head) {
		boolean ret = false;
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				ret = true;
				break;
			}
		}
		return ret;
	}
	}



