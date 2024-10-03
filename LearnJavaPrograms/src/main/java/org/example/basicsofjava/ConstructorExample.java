package org.example.basicsofjava;

public class ConstructorExample {

    String constructorName;
    String constructorType;

    ConstructorExample(String Name,String Type){
        constructorName=Name;
        constructorType=Type;
    }

    public boolean constructorExplain(){
        System.out.println("constructor name is" + constructorName);
        return false;
    }

    /*
    Constructor
    Block of code that initializes newly created object

    Properties of Constructor
    1)Constructor name must be same as class name
    2)no return type
    3)cannot be abstract,static,final and synchronized

    Types of constructors
    Default
    No Arguments
    Parameterized


    Default
    When we don't provide any constructor compiler will provide one
    used to provide default values to object like null,0

    No Argument Constructor
    Np arguments will be there
    It will allow us to write logic when an object is created


    parameterized constructor

    we can overload constructor

    super keyword
    when we have parent child relationship

    this keyword through which object we are invoking





     */

    String name;
    int age;

//
//    public class Employee{
//        int emp_id;
//        String emp_name;
//        Employee(){
//            emp_id=5;
//            emp_name="siva";
//            System.out.println("Employee object is created");
//        }
//
//    }

    public static void main(String[] args) {
//        ConstructorExample constructorExample=new ConstructorExample();
//        System.out.println(constructorExample.age);
//
        ConstructorExample constructorExample=new ConstructorExample("train","students");
       System.out.println(constructorExample.constructorExplain());




    }
}
