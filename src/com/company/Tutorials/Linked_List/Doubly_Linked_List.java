package com.company.Tutorials.Linked_List;

public class Doubly_Linked_List {

    public static class Node {
        public int data;
        public Node prev;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static class Operations {
        Node head;

        public void createDoubleLinkedList(int[] arr) {
            if (arr == null || arr.length == 0) {
                head = null;
                return;
            }

            head = new Node(arr[0]); // Create the head node
            Node temp = head;

            // Iterate through the array and create the linked list
            for (int i = 1; i < arr.length; i++) {
                Node newNode = new Node(arr[i]);
                temp.next = newNode;
                newNode.prev = temp;
                temp = newNode;
            }
        }

        // ----------------------- Printing ---------------------------------
        public void printList() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data);
                if (temp.next != null) {
                    System.out.print(" <-> ");
                }
                temp = temp.next;
            }
            System.out.println(" -> NULL");
        }

        // ----------------------------- Deleting ---------------------------
        public void deleteAtXPosition(int x) {
            // Base Case: When the head is null
            if (head == null) {
                return;
            }

            Node temp = head;
            int count = 1;

            // Case 1: Deleting the head node
            if (x == 1) {
                head = temp.next;
                head.prev = null;
            }

            while (temp != null) {
                if (count == x) {
                    // Case 2: Deleting the last node
                    if (temp.next == null) {
                        temp.prev.next = null;
                    }
                    // Case 3: Deleting node int the middle
                    else {
                        temp.prev.next = temp.next;
                        temp.next.prev = temp.prev;
                    }
                }
                temp = temp.next;
                count++;
            }
            return;
        }

        // -------------------------------- Inserting --------------------------------
        public void inserAtXPosition(int x, int data) {
            Node newNode = new Node(data);
            // Base case: If head is null
            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            int pos = 1;

            while (temp != null) {
                if (pos == x) {
                    // Case 1: Inserting at tail
                    if (temp.next == null) {
                        temp.next = newNode;
                        newNode.prev = temp;
                        return;
                    }
                    // Case 2: Inserting at middle
                    else {
                        newNode.next = temp.next;
                        newNode.prev = temp;
                        temp.next = newNode;
                        return;
                    }
                }
                temp = temp.next;
                pos++;
            }
            return;
        }

        // ------------------------------- Reversing --------------------------------
        public void reverse() {
            // Base Case
            if (head == null) {
                return;
            }

            Node prev = null;
            Node curr = head;
            Node next = null;

            while (curr != null) {
                next = curr.next;
                curr.prev = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            head = prev;
            return;
        }
    }

    public static void main(String[] args) {
        Operations operation = new Operations();
        int[] arr = { 1, 2, 3, 4, 5 };

        // Create the doubly linked list
        operation.createDoubleLinkedList(arr);
        operation.printList();

        // Delete at 3rd position
        operation.deleteAtXPosition(3);
        operation.printList();

        operation.inserAtXPosition(2, 3);
        operation.printList();

        operation.reverse();
        operation.printList();
    }
}