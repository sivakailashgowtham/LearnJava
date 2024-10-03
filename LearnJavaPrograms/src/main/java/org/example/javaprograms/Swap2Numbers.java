package org.example.javaprograms;

public class Swap2Numbers {


    public static void main(String[] args) {

        int a=5;
        int b=6;
        int c=0;
        System.out.println("Before swapping " + a + " " +  b);

        c=a;
        a=b;
        b=c;
        System.out.println("After swapping " + a + " " + b);

        int x=50;
        int y=60;
        int z=x+y;
        System.out.println("Before swapping " + x + " " +  y);
        x=z-x;
        y=z-y;

        System.out.println("After swapping " + x + " " + y);



    }

}
