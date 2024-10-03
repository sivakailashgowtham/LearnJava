package org.example.basicsofjava;

import java.util.ArrayList;

public class Polymorphism {

    /*

    Capability of a method to do different things based on the object that is acting upon

    Method overloading/static polymorphism/compile/early binding

    Method name should be same
    Arguments should change
    Data type should change
    happens in same class

    Method overriding/dynamic polymorphism

    Parent child
    happens in different class
    child class not satisfied by the implementation of parent class


    parent class
    check status code()Status code is 200

    child class
    @Override
    check status code() status code is 201


                    loading                riding
method name        same                    same
Arguments          different               same
return type        anything                same
Access modifier    anything                same


     */


    public static void main(String[] args) {


        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1,6);



    }
}
