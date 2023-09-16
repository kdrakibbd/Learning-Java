package more_example.super_keyword;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
    String color;
    double weight;

    public Vehicle(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public void drive() {
        System.out.println("Parent . . .");
        System.out.println("Color : "+color);
        System.out.println("Weight : "+weight);
    }
}

class Car extends Vehicle {
    int gear;

    public Car(String color, double weight, int gear) {
        super(color, weight);
        this.gear = gear;
    }

    @Override
    public void drive() {
        System.out.println("Child . . .");
        System.out.println("Color : "+color);
        System.out.println("Weight : "+weight);
    }

    public void wheel() {

    }

}


public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Car("White", 350, 5);
    }
}
