package org.example.javaprograms;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        int rev_num=0;

        while (num>0){
            rev_num=rev_num*10+num%10;
            num=num/10;
        }
System.out.println("Reversal number is " + rev_num);
    }
}
