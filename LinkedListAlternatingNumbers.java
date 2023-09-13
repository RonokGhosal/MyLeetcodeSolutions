package DSA;

import javax.swing.*;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.List;

public class LinkedListAlternatingNumbers {
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
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode two3 = new ListNode(5);
		ListNode three2 = new ListNode(6);
		ListNode four1 = new ListNode(7);

		one.next = two;
		two.next = three;
		three.next = four;
		four.next = two3;
		two3.next = three2;
		three2.next = four1;

		ListNode mid = getMidNode(one);
		int midVal = mid.next.val;
		ListNode tmpMid = mid;

		ListNode midRev= reverseNodeWithRecursion(mid.next);
		while(midRev != tmpMid.next  && one != tmpMid.next)  {
			System.out.print(one.val);
			System.out.print(" ");
			System.out.print(midRev.val);
			System.out.print(" ");
	        one = one.next;
			midRev = midRev.next;
		}

		System.out.print(midVal);

	}


	public static ListNode getMidNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		fast = fast.next.next;
		while (fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	public static ListNode reverseNode(ListNode head) {
		if (head==null || head.next==null) {
			return head;
		}
		ListNode prev = null;
		ListNode cur = head;
		while (cur!=null) {
			ListNode tmp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = tmp;
		}
		return prev;
	}

	public static ListNode reverseNodeWithRecursion(ListNode head) {
		if (head==null || head.next==null) {
			return head;
		}
		ListNode newNode = reverseNodeWithRecursion(head.next);
		ListNode tmp = head.next;
		tmp.next = head;
		head.next = null;
		return newNode;
	}
}
