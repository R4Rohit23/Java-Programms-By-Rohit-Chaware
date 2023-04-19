package com.company.Tutorials;

public class SinglyLinkedList {
    Node head; // Head of the List

    //Linked List Node Creation
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insertion Operation At Head
    public void insertAtHead(int data){
        // Creating a node
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //Insertion Operation at Tail
    public void insertAtTail(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }

        Node temp = head;

        // Now traversing the list
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //-------------------- Deletion Operation --------------------------------
    // Delete from head
    public void deleteAtHead()
    {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Delete from tail
    public void deleteAtTail()
    {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        if(head.next == null)
        {
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;


    }

    // Delete the particular data
    public void deleteKey(int key)
    {
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // traversing list to find the given key
        while(temp != null && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }

        // if key is not found in the list
        if(temp == null) {
            System.out.println("Key is not found"); return; }

        prev.next = temp.next;
    }

    // Delete from particular position
    public void deleteAtPos(int pos)
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }

        if(pos == 0)
        {
            head = head.next;
            return;
        }

        Node temp = head, prev = null;

        while(temp != null && pos-- != 0)
        {
            prev = temp;
            temp = temp.next;
        }

        if(temp == null)
        {
            System.out.println("Position is undefined");
            return;
        }

        prev.next = temp.next;
    }

    // ------------------------------------------ Reversing --------------------------------------------------------
    public void reverse()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }

        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    // ----------------------------------------- Printing the List ---------------------------------------------------
    public void printList()
    {
        if(head == null) {
            System.out.print("List is empty");
            return;
        }

        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Creating a empty list
        SinglyLinkedList list = new SinglyLinkedList();

        //adding data
        list.insertAtHead(1);
        list.insertAtHead(0);
        list.insertAtTail(2);
        list.insertAtTail(3);

        //printing list
        list.printList();

        //reversing
        list.reverse();
        list.printList();

        //deleting data
        list.deleteAtTail();
        list.printList();

        list.deleteAtHead();
        list.printList();

        list.deleteKey(0);
        list.printList();

        list.deleteAtPos(1);
        list.printList();


    }
}
