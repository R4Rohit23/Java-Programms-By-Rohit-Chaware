package com.company.Tutorials.LinkedList.Basic_Problems;

// ❔ Here we are going to pairwise swap the elements of the linked list
public class Pair_Wise_Swap_Nodes {

     static class LinkedList {
        Node head; // head of list

        /* Linked list Node*/
        static class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        /* Utility functions */

        /* Inserts a new Node at front of the list. */
        public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
            Node new_node = new Node(new_data);

            /* 3. Make next of new Node as head */
            new_node.next = head;

            /* 4. Move the head to point to new Node */
            head = new_node;
        }

        /* Function to print linked list */
        void printList()
        {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        // Iterative way ✌
        void pairWiseSwap()
        {
            Node temp = head;
            // we need 2 elements
            while(temp != null && temp.next != null)
            {
                int k = temp.data;
                temp.data = temp.next.data;
                temp.next.data = k;
                // Jump after 2 elements
                temp = temp.next.next;
            }
        }
     }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();

        /* Created Linked List 1->2->3->4->5 */
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.println("Linked List before calling pairWiseSwap() ");
        llist.printList();

        llist.pairWiseSwap();

        System.out.println("Linked List after calling pairWiseSwap() ");
        llist.printList();
    }
}
