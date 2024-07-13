package com.company.LeetCode_Problems.LinkedList;
// Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with
// even indices, and return the reordered list.
// The first node is considered odd, and the second node is even, and so on.

public class Odd_Even_List {
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

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        // Define 3 iterator odd to iterate odd nodes, even to iterate even nodes, evenHead to store the even list head
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode newHead = oddEvenList(head);

        ListNode temp = newHead;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
