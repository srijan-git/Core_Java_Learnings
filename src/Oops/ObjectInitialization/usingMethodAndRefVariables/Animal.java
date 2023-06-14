package Oops.ObjectInitialization.usingMethodAndRefVariables;

public class Animal {
    //Instance Variable
    String colour;
    int age;

    void initObj(String c, int a) {
        colour = c;
        age = a;
    }

    void display() {
        System.out.println("The colour of the dog is: " + colour + "\nand age is: " + age);
    }

    public static void main(String[] args) {
        Animal buzo = new Animal();
        buzo.initObj("Black", 10);
        buzo.display();
    }
}
