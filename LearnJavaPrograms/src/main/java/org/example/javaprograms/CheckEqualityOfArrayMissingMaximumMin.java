package org.example.javaprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckEqualityOfArrayMissingMaximumMin {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers and 0 to exit");

        ArrayList<Integer>arrayList=new ArrayList<>();
        ArrayList<Integer>compareArrayList=new ArrayList<>();

        int org_sum=0;
        int new_sum=0;
        int lar_num=0;

        while(true){
            int num=scanner.nextInt();
            if(num==0){
                break;
            }
            arrayList.add(num);
        }

        compareArrayList.addAll(arrayList);
        int small_num= compareArrayList.getFirst();
        for(Integer i:compareArrayList){
            org_sum=org_sum+i;
            if(i>lar_num){
                lar_num=i;
            }
             small_num= compareArrayList.getFirst();
            if(i<small_num){
                small_num=i;
            }


        }
        compareArrayList.removeLast();
        for(Integer k:compareArrayList){
            new_sum=new_sum+k;
        }
System.out.println("Missing element in an array is " + (org_sum-new_sum));
        System.out.println("Large number in an array is " + lar_num);
        System.out.println("small number in an array is " + small_num);
        System.out.println(arrayList.equals(compareArrayList));
    }
}
