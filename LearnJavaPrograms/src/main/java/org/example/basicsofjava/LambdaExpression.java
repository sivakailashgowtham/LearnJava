package org.example.basicsofjava;

public class LambdaExpression {

    /*
    functional interface is an interface with exactly one abstract method



     */

    interface A{
        void display();
    }
    public static void main(String[] args) {

        A obj=()->


                System.out.println("hai");
        obj.display();




    }

}
