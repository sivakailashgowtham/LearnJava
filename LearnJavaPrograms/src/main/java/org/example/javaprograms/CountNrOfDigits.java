package org.example.javaprograms;

import java.util.Scanner;

public class CountNrOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int count=0;

        while (num>0){
            num=num/10;
            count++;
        }

        System.out.println("Total count of a digits are " + count);

    }
}
