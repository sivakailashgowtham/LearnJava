package org.example.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

/*
elements will be retrieved based on natural sorting order
insertion order will not be maintained because it will be retrieved on natural sorting order
underlying DS is binary search tree
Heterogeneous objects are not allowed
 because all elements need to be comparable
 it implements comparable interface


 */



    public static void main(String[] args) {

        TreeSet<Integer>treeSet=new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(8);
        treeSet.add(9);
        treeSet.add(4);
        treeSet.add(11);
        treeSet.add(16);


        System.out.println(treeSet);

        //head set give values less than that
        treeSet.headSet(3);
        treeSet.tailSet(1);

        System.out.println(treeSet.higher(8));

        //comparator returns null if using default sorting order

        //descending iterator

        Iterator<Integer>desc=treeSet.descendingIterator();
        while (desc.hasNext()){
            System.out.println(desc.next());
        }



    }
}
