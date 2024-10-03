package org.example.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    /*

    set is one of the child interface of collection
    duplicate values are not allowed
    insertion order is not maintained
    Can insert heterogeneous object



    HashSet
    underlying DS HashMAp
     insertion order is not maintained
    null elements are allowed
    implements serializable and cloneable interface
    data are stored on hashcode so search is effective

     */


    public static void main(String[] args) {

        HashSet<String>hashSet=new HashSet<>();
        hashSet.add("polo");
        hashSet.add("Skoda");
        hashSet.add("audi");
        hashSet.add(null);
        hashSet.add("Hundai");
        hashSet.add("Hundai");

        System.out.println(hashSet);

        hashSet.remove("skoda");

        //add all
        System.out.println(hashSet.contains("polo"));

        Iterator<String>iterator= hashSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
