package org.example.arrays;

public class PascalTriangle {
    public static void main(String[] args) {
        int nUmberOfLines=5;
        int row,count=0;

        for(row=1;row<=nUmberOfLines;row++){

            for(count=1;count<row;count++){

                System.out.print("*");
            }
            System.out.println("*");
        }


    }
}
