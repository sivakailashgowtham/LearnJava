package org.example.javaprograms;

public class OccurenceOfCharecterInString {

    public static void main(String[] args) {

        String name = "sivakailash";
        int count = 0;

        String replaced="";

         char element_to_search='a';

         for(int i=0;i<name.length();i++){
             if(element_to_search==name.charAt(i)){
                 count++;
               replaced=  name.replace('a','@');
             }
         }
         System.out.println(count);
         System.out.println(replaced);
    }
    }
