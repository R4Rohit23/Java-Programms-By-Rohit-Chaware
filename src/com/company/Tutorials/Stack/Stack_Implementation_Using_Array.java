package com.company.Tutorials.Stack;

class Stack {
    int maxSize; // Maximum size of the stack
    int[] array; // Stack Array
    int top; // Top element of the stack

    // Constructor to create stack
    public Stack(int size) {
        this.maxSize = size;
        this.array = new int[size];
        this.top = -1;
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow");
            return;
        }
        array[++top] = value;
        System.out.println(value + " pushed into the stack");
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        int poppedElement = array[top--];
        System.out.println(poppedElement + " popped from the stack");
        return poppedElement;
    }

    // Method to peek the top element of the stack
    public int top() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return array[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }
}

public class Stack_Implementation_Using_Array {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);

        // Peeking the top element
        System.out.println("Top element of the stack: " + stack.top());

        // Popping elements from the stack
        stack.pop();
        stack.pop();
        stack.pop(); // Trying to pop from an empty stack

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
