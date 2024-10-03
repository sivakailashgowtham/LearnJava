package org.example.collections;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Objects;

public class ArrayListExample {


    /*
    insertion order will be maintained
    Duplicate element will be allowed
    Best suited for search operations and performs the worst on insertion and deletion

    for insertion or deletion it will take lots of time

    non synchronized
    it won't allow multi threading

    underlying DS in resizable or growable array
    Default capacity is 10
    growth Rate:current size+current size/2

    implements Random access,Serializable and cloneable interfaces







     */

    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
        ArrayList<Integer> newarrayList=new ArrayList<>();

        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(1,6);
        //method overloading
        //same method name with different parameter
        System.out.println(arrayList);


        //to retrieve an element
        arrayList.getFirst();

        arrayList.indexOf(3);
        //it will retrieve first occurrence

        arrayList.lastIndexOf(3);
        //it will retrieve last occurrence

       newarrayList.addAll(arrayList);

       System.out.println(newarrayList);


        arrayList.remove(2);


        System.out.println(arrayList.isEmpty());

        for(Integer i:newarrayList){
            System.out.println("Elements in the list " + i);
        }

        ListIterator<Integer>listIterator= arrayList.listIterator();
        //we cannot create an object for interface

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        ArrayList<Object>generic=new ArrayList<>();
        generic.add(1);
        generic.add("kailash");
        generic.add(true);

        System.out.println(generic);











    }
}
