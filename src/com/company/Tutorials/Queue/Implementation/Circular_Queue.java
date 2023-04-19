package com.company.Tutorials.Queue.Implementation;
// this is a classical two pointer approach
class MyCircularQueue {
    // to store the elements of the queue
    private final int[] data;
    private int head;
    private int tail;
    private final int size;

    public MyCircularQueue(int k) {
        // initialize data array with size of k
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }

    public void enQueue(int val) {
        if (isFull())
            return;
        // head will be starting position
        if (isEmpty())
            head = 0;

        // if in 0 based indexing tail exceeds the maximum size
        // ex => if size = 8 and tail is 8 so tail will be 0 so new element will be added to the 0th position if head is
        // no there
        tail = (tail + 1) % size;
        data[tail] = val;
    }

    public void deQueue() {
        // no element to delete
        if(isEmpty())
            return;

        // only 1 element is there
        if (head == tail) {
            head = -1;
            tail = -1;
            return;
        }
        // changing the position of the head
        head = (head + 1) % size;
    }

    // get the front element of the queue
    public int front() {
        if(isEmpty())
            return -1;
        return data[head];
    }

    // get last element
    public int rear() {
        if (isEmpty()) {
            return -1;
        }
        return data[tail];
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        // if the tail collided with head so no space will be there to insert another element
        return ((tail + 1) % size) == head;
    }
}
public class Circular_Queue {
    public static void main(String[] args) {
        // crating an object of MyCircularQueue class with size 5
        MyCircularQueue q = new MyCircularQueue(5);

        // adding 1 2 3 4 5
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        // now if you try to add another element then it returns false because q is full,
        // so you need to dequeue the q one time so the first position element is deleted
        // and a place is vacant
        // now you add element at position 0 like this => (4+1) % 5
        q.deQueue();
        q.enQueue(6);

        System.out.println(q.front());
        System.out.println(q.rear());

        // looping through the queue
        while (!q.isEmpty()) {
            System.out.print(q.front());
            q.deQueue();
        }
    }
}
