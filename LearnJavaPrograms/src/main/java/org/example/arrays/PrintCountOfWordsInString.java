package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class PrintCountOfWordsInString {

    public static void main(String[] args) {

        String name="sivakailashgowtham";

        HashMap<Character,Integer>hashMap=new HashMap<>();

        for(int i=0;i<name.length();i++){

            hashMap.put(name.charAt(i),hashMap.getOrDefault(name.charAt(i),0)+1);

        }

            for(Character c: hashMap.keySet()){
                if(hashMap.get(c)>=2){
                    System.out.println(c + " " + hashMap.get(c));
                }
            }
        }
       }


