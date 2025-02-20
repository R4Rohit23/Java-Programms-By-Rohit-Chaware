package com.company.LeetCode_Problems.LinkedList;

import com.company.Tutorials.Linked_List.SinglyLinkedList.Node;
import com.company.Tutorials.Linked_List.SinglyLinkedList.Operations;

// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.

public class Merge_Two_Sorted_List {
    public static Node mergeTwoSortedList(Node list1, Node list2) {
        Node dummyNode = new Node(0);
        Node curr = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        curr.next = (list1 != null) ? list1 : list2;

        return dummyNode.next;
    }
    public static void main(String[] args) {
        Operations list1 = new Operations();
        list1.insertAtTail(1);
        list1.insertAtTail(2);
        list1.insertAtTail(4);

        Operations list2 = new Operations();
        list2.insertAtTail(1);
        list2.insertAtTail(3);
        list2.insertAtTail(4);

        Node res = mergeTwoSortedList(list1.head, list2.head);
        list1.printList(res);
    }
}
