package org.example.javaprograms;

import java.util.Scanner;

public class SumOFDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int sum=0;
        int rem=0;

        while (num>0){

            sum=sum+num%10;
            num=num/10;

        }

        System.out.println("Total sum of a digits are " + sum);

    }
}
