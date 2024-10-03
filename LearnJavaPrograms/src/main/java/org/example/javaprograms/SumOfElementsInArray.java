package org.example.javaprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfElementsInArray {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers and 0 to exit");
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> evenArrayList = new ArrayList<>();
        ArrayList<Integer> oddArrayList = new ArrayList<>();
        int sum = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            arrayList.add(num);
        }

            for (int i = 0; i <= arrayList.size() - 1; i++) {
                sum = sum + arrayList.get(i);
            }


            System.out.println(arrayList);
            System.out.println("Sum of an array is " + sum);

            for(Integer i:arrayList){
                if(i%2==0){
                    evenArrayList.add(i);
                }
                else{
                    oddArrayList.add(i);
                }
            }
            System.out.println("even numbers in the list" + evenArrayList);
            System.out.println("Odd numbers in the list" + oddArrayList);

    }
}