package org.practice.oops;

import java.util.ArrayList;
import java.util.Vector;

class Vehicle{
    //class variables
    static int count = 0;

    //instance variables
    private int regNo;
    private String model;
    private String color;
    private int price;


    Vehicle(){
        System.out.println("Vehicle object is created");
    }
    Vehicle(int regNo, String model, String color, int price){
        this.regNo = regNo;
        this.model = model;
        this.color = color;
        this.price = price;
        System.out.println("Vehicle object is created with parameters");
    }

    void start(){
        System.out.println("Vehicle is starting");
    }
    void run(){
        System.out.println("Vehicle is running");
    }
}



class Car extends Vehicle {
    //attributes
    int regNo;
    String model;
    String color;
    int price;

    Car(){

    }
    Car(int regNo, String model, String color, int price){
        this.regNo = regNo;
        this.model = model;
        this.color = color;
        this.price = price;
        System.out.println("Car object is created with parameters");
    }


    //methods or behaviors
    void start(){
        System.out.println("Car is starting");
    }

//    int start(){
//        System.out.println("Car is starting through int method");
//        return 0;
//    }

    void run(){
        System.out.println("Car is running");
    }
}

public class ClassDemo{
    public static void main(String[] args) {
        Car obj = new Car();

//        int v = obj.start();


    }

}

