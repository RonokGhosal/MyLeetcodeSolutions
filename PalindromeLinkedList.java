import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public class PalindromeLinkedList {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);

		l1.next = l2;
		l2.next = null;


		ListNode midNode = middleNode(l1);
	    ListNode last = l1;
		System.out.println(isPalindrome(l1));
	}

	public static ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static ListNode reveseList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		while (current!=null) {
			ListNode next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}



	public static boolean isPalindrome(ListNode head) {
		if ( head == null || head.next == null ) {
			return true;
		}
        ListNode midNode = middleNode(head);
		ListNode midnodeRev = reveseList(midNode);
		ListNode start = head;
		ListNode end = midnodeRev;
		while (end!=null) {
			if (start.val!= end.val) {
				return false;
			} else {
				start = start.next;
				end = end.next;
			}
		}
		return true;
	}

	}

