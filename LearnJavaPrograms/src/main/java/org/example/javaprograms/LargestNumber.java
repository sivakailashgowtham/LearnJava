package org.example.javaprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers and 0 to exit");
        ArrayList<Integer>arrayList=new ArrayList<>();

        while(true){
            int num=scanner.nextInt();

            if(num==0){
                break;
            }
            arrayList.add(num);
        }
        System.out.println(arrayList);
        int large_num=0;

        int small_num=arrayList.getFirst();
        for(Integer i:arrayList){
            if(i>large_num){
                large_num=i;
            }
           if(i<small_num){
               small_num=i;
           }

        }



        System.out.println("LargeNumber is " + large_num);
        System.out.println("SmallNumber is " + small_num);




    }
}
