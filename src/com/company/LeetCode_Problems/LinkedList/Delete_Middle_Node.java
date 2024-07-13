package com.company.LeetCode_Problems.LinkedList;

// Given the LinkedList U have to delete the middle node of the linkedlist
// Here we are going to use Slow and Fast pointer approach
public class Delete_Middle_Node {
    public static class ListNode {
        int data;
        ListNode next;

        ListNode() {

        }
        ListNode(int val) {
            this.data = val;
            this.next = null;
        }
    }

    public static ListNode deleteMiddle(ListNode head) {
        // If only single node is present in the linkedlist then after deleting that node no node will be present
        if (head.next == null) {
            return null;
        }

        // define slow and fast pointers
        // slow will run one step at a time
        // fast will run two step at a time
        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode newHead = deleteMiddle(head);

        ListNode temp = newHead;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
