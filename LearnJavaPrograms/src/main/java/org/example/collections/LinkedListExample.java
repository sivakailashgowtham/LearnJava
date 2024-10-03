package org.example.collections;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListExample {

    /*
    insertion or deletion will be easy
    Not suited for search operations

    insertion order will be maintained
    Duplicates are allowed

    all the collections will implement serializable and cloneable interface
    linked list also implements but not random access interface




     */


    public static void main(String[] args) {

        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(10);

        linkedList.addFirst(4);
        linkedList.addLast(8);

        System.out.println(linkedList);

        linkedList.get(0);

        linkedList.removeFirst();

        //poll and poll first delete first element in the list
        linkedList.poll();
        linkedList.pollLast();

        //remove last occurrence
        linkedList.removeLastOccurrence(3);





    }
}
