package org.example.javaprograms;

import java.util.Scanner;

public class FactorialOfANumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
           fact=fact*i;
        }
        System.out.println(fact);
    }
}
