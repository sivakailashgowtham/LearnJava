package org.example.javaprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchingAnElementInArray {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers and 0 to exit");

        ArrayList<Integer> arrayList=new ArrayList<>();

        while(true){
            int num=scanner.nextInt();
            if(num==0){
                break;
            }
            arrayList.add(num);
        }

        System.out.println(arrayList.getFirst());





    }
}
