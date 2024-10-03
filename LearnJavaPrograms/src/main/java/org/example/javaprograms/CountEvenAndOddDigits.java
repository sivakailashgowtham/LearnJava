package org.example.javaprograms;

import java.util.Scanner;

public class CountEvenAndOddDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int odd=0;
        int even=0;
        while (num>0){
            if(num%2==0){
                even++;
            }
            else {
                odd++;
            }
            num=num/10;
        }
        System.out.println("Count of even digits are " + even);

        System.out.println("Count of odd digits are " + odd);



    }
}
