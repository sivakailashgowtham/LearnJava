package org.example.basicsofjava;

public class StringBufferExample {

    /*
    string is immutable
    String buffer is mutable
    existing one will get over ride

    String buffer is synchronised/thread safe
    two thread cant call the buffer simultaneously
    less efficient

    String builder

    child class of char sequence
    mutable
    Non-synchronised/Not thread safe
    high efficient
    two thread can call builder simultaneously




     */


    public static void main(String[] args) {

        String name="siva";
        System.out.println(name.concat("kailash"));
        System.out.println("original name " + name);
System.out.println("   ------------------------------------  ");

        StringBuffer word=new StringBuffer("kailash");
        System.out.println(word.append("siva"));
        System.out.println("original name in string buffer is " + word);

        //String buffer can be reversed not string
        System.out.println(word.reverse());

        //replace
        System.out.println(word.replace(0,3,"a"));

        //delete
        word.delete(1,2);






    }
}
