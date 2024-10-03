package org.example.string;

import java.util.HashMap;
import java.util.Scanner;

public class MaximumOccuringCharecterInString {


    public static void main(String[] args) {

        String name="sivakailashgowtham";

        HashMap<Character,Integer> hashMap=new HashMap<>();

        for(char c:name.toCharArray()){
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());

        int maxCount=1;




        for(char c: hashMap.keySet()){
            if(hashMap.get(c)>maxCount){
                System.out.println(hashMap.get(c) + " " + c);
               // maxCount=hashMap.get(c);
             //   maxChar=c;


            }
        }




          }

    }

