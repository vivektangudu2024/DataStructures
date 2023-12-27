package com.day9;

class Stack<T> {
    private LinkedList<T> linkedList;

    public Stack() {
        linkedList = new LinkedList<>();
    }

    // Push operation to add an element to the top of the stack
    public void push(T data) {
        linkedList.appendAtStart(data);
    }

    // Pop operation to remove and return the element from the top of the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        T top = linkedList.head.data;
        linkedList.deleteAtPosition(0);
        return top;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return linkedList.head == null;
    }

    // Display the stack
    public void display() {
        System.out.print("Stack: ");
        linkedList.display();
    }
}


