package org.example.javaprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateElementsInAnArray {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i< arr.length;i++){
            arr[i]=scanner.nextInt();
        }
       boolean flag=false;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){

                if(arr[i]==arr[j]){
                    System.out.println("Duplicate element is " + arr[i]);

                    flag=true;
                    break;
                }
            }

            }
            if(!flag){
                System.out.println("No duplicate element found");
        }

    }
}
