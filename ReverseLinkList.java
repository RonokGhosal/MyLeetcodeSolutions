package DSA;

import java.util.jar.Attributes;

public class ReverseLinkList {
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
        ListNode two3 = new ListNode(3);
        ListNode three2 = new ListNode(2);
        ListNode four1 = new ListNode(1);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = two3;
        two3.next = three2;
        three2.next = four1;
        /*ListNode node = recursionReverseList(one);

        while (node!=null) {
            System.out.println(node.val);
            node = node.next;
        }*/
        if (isPalindrome( one)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur!=null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static ListNode recursionReverseList(ListNode head) {
        if (head==null || head.next==null) {
            return head;
        }

        ListNode newNode = recursionReverseList(head.next);
        ListNode temp = head.next;
        temp.next = head;
        head.next = null;
        return newNode;
    }


    public static ListNode findMiddle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        while(slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode head2 = head;
        ListNode mid = findMiddle(head2);
        System.out.println("Mid value is " + mid.val);
        ListNode end = recursionReverseList(mid);

        while(head != null && end !=null) {
            System.out.println(end.val);
            System.out.println(head.val);
            if (end.val != head.val) {
                return false;
            }
            end= end.next;
            head = head.next;

        }
        return true;
    }
}