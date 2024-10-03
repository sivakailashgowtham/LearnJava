package org.example.javaprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataInExcelFile {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter=new FileWriter("C:\\Users\\Nishevitha\\Desktop\\Manual Testing\\test123.txt");
        BufferedWriter bf=new BufferedWriter(fileWriter);
        bf.write("selenium with java");
        bf.write("selenium learning");
        System.out.println("Finished");
        bf.close();


    }
}
