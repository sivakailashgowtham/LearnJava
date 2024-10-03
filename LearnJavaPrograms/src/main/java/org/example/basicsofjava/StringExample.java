package org.example.basicsofjava;

import java.util.Locale;

public class StringExample {

    /*
    String is a sequence of characters

    String is immutable

    it is constant and cannot be changed once it created

    It implements serializable,comparable and char sequence interfaces

    How to create a String
    1)By String literal
    2)By new Keyword


     */
    public static void main(String[] args) {

        String name="kailash";
        //If we are creating using string literal it will store using heap memory
        String name1=new String("siva");
        //new keyword will create a new memory location
        name="gowtham";
       //kailash will move to garbage it wont over ride new one will be created

        System.out.println(name1);

        //returns character value for particular index
        System.out.println(name.charAt(1));
        //string length
        name.length();

        //check equality
        name.equals("siv");

        //equals ignore case checks equals without
        name.equalsIgnoreCase("sivA");

        name.isEmpty();
        name.contains("i");

        name.substring(1);
        name.substring(1,4);
        //method overloading

        //append the string to given string
        System.out.println(name.concat("kailash"));

        name.replace("a","A");

        System.out.println(name.indexOf("h"));

        //trim reduce the space

        //convert given data type to string
        System.out.println(String.valueOf(10));

        name.toLowerCase();

        name.toUpperCase();

        //Returns a joined string with given delimiter
        System.out.println(String.join("-","siva","kailash","gowtham"));




    }
}
