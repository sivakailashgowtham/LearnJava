package org.example.javaprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class HowToReadDataFromExcelFile {


    public static void main(String[] args) throws IOException {

        FileReader fileReader=new FileReader("C:\\Users\\Nishevitha\\Desktop\\Manual Testing\\test123.txt");

        BufferedReader bufferedReader=new BufferedReader(fileReader);

        String str;

        while ((str=bufferedReader.readLine())!=null){
                System.out.println(str);
        }
      bufferedReader.close();

    }
}
