package org.example.javaprograms;

import java.util.ArrayList;

public class MissingNumberInArray {


    public static void main(String[] args) {

        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(8);
        int old_total=0;
        for(Integer I:arrayList){
            old_total=old_total+I;
        }
        arrayList.remove(2);
        int new_total=0;
        for(Integer K:arrayList){
            new_total=new_total+K;
        }
        int missing_num=old_total-new_total;

        System.out.println("missing num is " + missing_num);



    }
}
