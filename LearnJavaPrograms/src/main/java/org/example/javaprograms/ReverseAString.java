package org.example.javaprograms;

import java.util.Scanner;

public class ReverseAString {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the word");
        String name=scanner.next();
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
           rev=rev + name.charAt(i);

        }
        System.out.println("Reversal is  " + rev);

    }
}
