package com.day9;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.display();

        System.out.println("Popped element: " + stack.pop());

        stack.display();
    }
}
