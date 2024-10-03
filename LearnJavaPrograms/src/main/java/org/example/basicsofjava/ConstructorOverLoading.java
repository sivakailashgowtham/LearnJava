package org.example.basicsofjava;

public class ConstructorOverLoading {

    String draw;

    ConstructorOverLoading(){
        System.out.println("hai");
    }
    ConstructorOverLoading(String toDraw){
        draw=toDraw;
        System.out.println("parameterized constructor");
    }


    public static void main(String[] args) {
        ConstructorOverLoading constructorOverLoading=new ConstructorOverLoading();

        ConstructorOverLoading test1=new ConstructorOverLoading("circle");



    }
}
