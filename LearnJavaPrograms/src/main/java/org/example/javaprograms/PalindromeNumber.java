package org.example.javaprograms;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        int org_num=num;
        int pal_num=0;

        while (num>0){
            pal_num=pal_num*10+num%10;
            num=num/10;
        }
       if(org_num == pal_num){
           System.out.println("given number is " + pal_num + " a palindrome number" );
       }
       else {
           System.out.println("not a palindrome number");
       }
    }

}
