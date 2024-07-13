package com.company.Concept_Problems.Linked_List;

// Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without
// modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
public class Swap_Nodes {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }
        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode swap(ListNode head) {
        if (head == null || head.next == null) return head;

        // we place a dummy node before the head node so that we can consider head in our iteration
        ListNode dummy = new ListNode();
        dummy.next = head;
        //  Now, let the head be our currNode. That means the node with value 1 is the currNode, and we have to swap
        //  it with the node with value 2. So for this, we will also have to keep track of the node previous to the
        //  currNode, let it be prevNode, as it's next pointer value will have to change after we swap the currNode
        //  and the node next to currNode.

        ListNode currNode = head;
        ListNode prevNode = dummy;

        while (currNode != null && currNode.next != null) {

            // Now the very first thing to do is change the next pointer of prevNode to point to currNode->next. Why??
            // Because in the answer we want the node with value 2 after the dummyNode. Right? So we will have to
            // connect dummyNode (prevNode) to the node with value 2 (currNode->next). This means

            prevNode.next = currNode.next;

            // Now, in our final answer node with value 1 should be at the place of node with value 2. So the next
            // pointer of node with value 1 should point to whatever the node with value 2 is pointing to originally.
            // That means we will have to change currNode->next to the next of next of prevNode, as currently prevNode
            // is dummyNode, prevNode->next is node with value 2 and prevNode->next->next = next of node with value 2.

            currNode.next = prevNode.next.next;

            // Now, as in the answer the node with value 2 should point to node with value 1. That means
            prevNode.next.next = currNode;

            // Now for the next iteration, we have to swap nodes with values 3 and 4. For that the prevNode should point
            // to node with value 1 and the currNode should point to node with value 3. This means
            prevNode = currNode;
            currNode = currNode.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next = new ListNode(3);
        list.next = new ListNode(4);
        list.next = new ListNode(5);

        ListNode temp = swap(list);

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

    }
}
