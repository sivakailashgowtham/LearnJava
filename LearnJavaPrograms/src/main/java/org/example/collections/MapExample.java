package org.example.collections;

import java.util.HashMap;

public class MapExample {
    /*

    It represents data in key value pair
    Duplicate keys are not allowed
    Duplicate values are allowed
    only one null key is allowed
    No insertion order
    value of the map can be fetched using its key



     */

    public static void main(String[] args) {

        HashMap<String,String>hashMap=new HashMap<>();
        HashMap<String,String>hashMap1=new HashMap<>();
        hashMap.put("name","siva");
        hashMap.put("Age","21");
        hashMap.put("location","chennai");

        System.out.println(hashMap);

        hashMap1.putAll(hashMap);

        hashMap.containsKey("name");
        hashMap.containsValue("siva");

        hashMap.isEmpty();

        System.out.println(hashMap.keySet());
        System.out.println(hashMap.entrySet());


    }
}
