package org.example.javaprograms;

import java.util.HashMap;

public class VowelsInString {

    public static void main(String[] args) {

        String name="sivakailashgowtham";
        HashMap<Character,Integer>hashMap=new HashMap<>();

        String vowels="aeiou";

        for(int i=0;i<name.length()-1;i++){
            for(int j=0;j<vowels.length()-1;j++){

                if(name.charAt(i)==vowels.charAt(j)){
                    System.out.println(name.charAt(i));
                    hashMap.put(name.charAt(i),hashMap.getOrDefault(name.charAt(i),0)+1);
                }
            }

        }

        System.out.println(hashMap);

    }
}
