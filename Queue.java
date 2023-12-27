package com.day9;

import java.util.NoSuchElementException;

class Queue<T> {
    private LinkedList<T> list;

    public Queue() {
        this.list = new LinkedList<>();
    }

    // Enqueue (add to the end)
    public void enqueue(T data) {
        list.appendAtLast(data);
    }

    // Dequeue (remove from the front)
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T data = list.head.data;
        list.deleteAtPosition(0);
        return data;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return list.size();
    }

    // Display the elements in the queue
    public void display() {
        System.out.print("Queue: ");
        list.display();
    }
}


