package com.day9;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.appendAtLast(1);
        list.appendAtLast(2);
        list.appendAtLast(3);

        System.out.print("Original List: ");
        list.display();

        list.appendAtStart(0);
        System.out.print("After Appending at Start: ");
        list.display();

        list.appendAtLast(4);
        System.out.print("After Appending at Last: ");
        list.display();

        list.appendAtPosition(5, 2);
        System.out.print("After Appending at Position 2: ");
        list.display();

        list.deleteAtPosition(3);
        System.out.print("After Deleting at Position 3: ");
        list.display();

        int searchKey = 2;
        if (list.search(searchKey)) {
            System.out.println(searchKey + " found in the list.");
        } else {
            System.out.println(searchKey + " not found in the list.");
        }
    }
}
