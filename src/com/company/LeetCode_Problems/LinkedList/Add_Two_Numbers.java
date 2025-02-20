package com.company.LeetCode_Problems.LinkedList;
import com.company.Tutorials.Linked_List.SinglyLinkedList.Node;
import com.company.Tutorials.Linked_List.SinglyLinkedList.Operations;

// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero,except the number 0 itself.

// class Node {
//     int value;
//     Node next;

//     Node(int value) {
//         this.value = value;
//         this.next = null;
//     }
// }

public class Add_Two_Numbers {
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node list1 = l1;
        Node list2 = l2;
        Node dummyHead = new Node(0);
        Node temp = dummyHead;
        int carry = 0;

        while (list1 != null || list2 != null) {
            int val1 = (list1 != null) ? list1.data : 0;
            int val2 = (list2 != null) ? list2.data : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;

            temp.next = new Node(sum % 10);
            temp = temp.next;

            if (list1 != null)
                list1 = list1.next;
            if (list2 != null)
                list2 = list2.next;
        }

        // If there is a remaining carry, add a new node with the carry value
        if (carry > 0) {
            temp.next = new Node(carry);
        }

        return dummyHead.next; // The result is the next node of the dummy head
    }

    public static void main(String[] args) {
        Operations operations1 = new Operations();
        Operations operations2 = new Operations();

        operations1.insertAtTail(9);
        operations1.insertAtTail(9);
        operations1.insertAtTail(9);
        operations1.insertAtTail(9);
        operations1.insertAtTail(9);
        operations1.insertAtTail(9);

        operations2.insertAtTail(9);
        operations2.insertAtTail(9);
        operations2.insertAtTail(9);
        operations2.insertAtTail(9);

        Node result = addTwoNumbers(operations1.head, operations2.head);

        operations1.printList(result);
        
    }
}
