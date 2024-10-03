package org.example.basicsofjava.abstraction;

public class BMW extends Abstraction implements InterfaceExample{


    @Override
    public void engineSecret(){
        System.out.println(" BMW Engine secret");
    }

    public static void main(String[] args) {
        Abstraction abstraction=new BMW();
        abstraction.engineSecret();

    }

    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }

    @Override
    public void price() {

    }
}
