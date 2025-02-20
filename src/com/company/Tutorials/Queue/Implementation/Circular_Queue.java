package com.company.Tutorials.Queue.Implementation;

class Queue {
    private int size;
    private int[] queueArray;
    private int head;
    private int tail;
    private int currentSize;

    public Queue(int size) {
        this.size = size;
        this.queueArray = new int[size];
        this.head = 0;
        this.tail = -1;
        this.currentSize = 0;
    }

    public boolean isQueueEmpty() {
        return (currentSize == 0);
    }

    public boolean isQueueFull() {
        return (currentSize == size);
    }

    public int peek() {
        return queueArray[head];
    }

    public void insert(int item) {
        if (isQueueFull()) {
            System.out.println("Queue is full!");
            return;
        }

        // If queue is not full and the tail is at the end of the array then shift tail
        // to starting position of the array so it starts filling the starting empty
        // positions
        // This is the example of circular queue
        if (tail == size - 1) {
            tail = -1;
        }

        queueArray[++tail] = item;
        currentSize++;
        System.out.println("Added to queue " + item);
    }

    public int remove() {
        if (isQueueEmpty()) {
            throw new RuntimeException("Queue is emtpy");
        }
        int res = queueArray[head++];

        if (head == size) {
            head = 0;
        }
        currentSize--;
        return res;
    }

    public void printQueue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int count = 0;
        int index = head;

        while (count < currentSize) {
            System.out.print(queueArray[index] + " ");

            // Move to the next index, wrapping around if necessary
            index = (index + 1) % size;
            count++;
        }
    }
    
}

public class Circular_Queue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        queue.printQueue();

    }
}
