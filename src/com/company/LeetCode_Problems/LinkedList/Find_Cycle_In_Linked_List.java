package com.company.LeetCode_Problems.LinkedList;
import com.company.Tutorials.Linked_List.SinglyLinkedList.Node;

public class Find_Cycle_In_Linked_List {

    public static boolean findCycleInLinkedList(Node head) {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);

        // Manually linking nodes
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3; // cyclic list

        boolean res = findCycleInLinkedList(head);

        System.out.println("Is their any cycle? " + res);
    }
}
