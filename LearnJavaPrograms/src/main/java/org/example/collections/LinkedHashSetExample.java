package org.example.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {


    /*
      insertion order will be maintained

    Duplicate values are not allowed

    underlying DS is HashTable+liked list


     */

    public static void main(String[] args) {

        LinkedHashSet<Integer>linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(5);

        System.out.println(linkedHashSet);

    }
}
