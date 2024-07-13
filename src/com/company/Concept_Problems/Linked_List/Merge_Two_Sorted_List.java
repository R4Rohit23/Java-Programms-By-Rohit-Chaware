package com.company.Concept_Problems.Linked_List;
// You are given the heads of two sorted linked lists list1 and list2.
// Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two
// lists.
// Return the head of the merged linked list.

public class Merge_Two_Sorted_List {
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

    public static ListNode mergeRecursive(ListNode list1, ListNode list2) {
        // if list1 is null then just return list2
        if (list1 == null)
            return list2;

        if (list2 == null)
            return list1;

        ListNode dummy;

        if (list1.data <= list2.data) {
            dummy = list1;
            dummy.next = mergeRecursive(list1.next, list2);
        }
        else {
            dummy = list2;
            dummy.next = mergeRecursive(list1, list2.next);
        }
        return dummy;
    }

    public static ListNode mergerIterative(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode dummy = temp;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                dummy.next = list1;
                list1 = list1.next;
            }
            else {
                dummy.next = list2;
                list2 = list2.next;
            }
            dummy = dummy.next;
        }
        if (list1 == null) return dummy.next = list2;
        else dummy.next = list1;

        return temp.next;
    }
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(3);
        listNode1.next.next = new ListNode(5);

        ListNode listNode2 = new ListNode(2);
        listNode2.next = new ListNode(4);
        listNode2.next.next = new ListNode(6);

        ListNode head = mergeRecursive(listNode1, listNode2);

        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        ListNode head2 = mergerIterative(listNode1, listNode2);

        while(head2 != null) {
            System.out.print(head2.data + " ");
            head2 = head2.next;
        }
    }
}
