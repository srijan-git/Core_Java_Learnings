package Oops.Abstraction;

abstract class Vehicle {
    int no_of_tyres;

    abstract void start();

    //Concrete Methods
    void show() {
        System.out.println("Show method of Parent class");
    }


}

public class Car extends Vehicle {
    void start() {
        System.out.println("Starts with key");
    }

    @Override
    void show() {
        super.show();
        System.out.println("Overriding The method of parent class and write some new things");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.show();

    }
}
