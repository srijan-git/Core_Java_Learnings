package Oops.ClassObj;

public class Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public static void main(String[] args) {
        System.out.println("Inside Main Method");
        Animal buzo = new Animal();
        buzo.eat();
    }
}
