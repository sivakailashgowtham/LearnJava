package org.example.collections;

import java.util.TreeMap;

public class TreeMapExample
{

    /*
    it will maintain the sorting order
    Null key is not allowed

 if duplicate key value will get over ride



     */

    public static void main(String[] args) {
        TreeMap<String,String> treeMap=new TreeMap<>();

        treeMap.put("annanagar","chennai");
        treeMap.put("kknagar","chennai");
        treeMap.put("maduravoyal","chennai");
        treeMap.put("adayar","chennai");

        System.out.println(treeMap);



    }
}
