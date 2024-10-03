package org.example.javaprograms;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        String name=scanner.next();
        String org_string=name;
        String pal_string="";
        for(int i=name.length()-1;i>=0;i--){
          pal_string=pal_string +  name.charAt(i);
        }
        if(pal_string.equals(org_string)){
            System.out.println("Given string is" + pal_string +" is a palindrome" );
        }
        else{
            System.out.println("not a palindrome string");
        }

    }
}
