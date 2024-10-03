package org.example.basicsofjava.abstraction;

public class Benz extends Abstraction {


    @Override
    public void engineSecret(){
        System.out.println(" Benz Engine secret");
    }
    public static void main(String[] args) {
        Abstraction abstraction=new Benz();
        abstraction.engineSecret();

    }



}
