package Oops.Interface;

interface I1 {
    //This defines a blueprint of a class which does not says what to do

    public abstract void show();
    //other than public no other access specifier is allowed here

    default void display() {
    } //In order to create a
    // Concrete method we need to specify default access modifier

    //Another way to create concrete methods is
    static void run() {
    }


    //In case of variable
    public static final int a = 10;
    int b = 10;//By default, compiler automatically make it public static final
}

//We can achieve Multiple Inheritance using Interface

interface I2 {
    void call();
}


public class Test implements I1, I2 {
    @Override
    public void show() {
        System.out.println("Calling Show from Test class");
    }


    @Override
    public void call() {
        System.out.println("Calling call function from the Test class");
    }


    public static void main(String[] args) {
        //We cannot create object of a Interface
        Test t1 = new Test();
        t1.show();
        t1.call();
    }

}
