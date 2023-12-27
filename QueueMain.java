package com.day9;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.display();

        System.out.println("Dequeue: " + queue.dequeue());
        queue.display();

        System.out.println("Is Empty? " + queue.isEmpty());
        System.out.println("Queue Size: " + queue.size());
    }
}
