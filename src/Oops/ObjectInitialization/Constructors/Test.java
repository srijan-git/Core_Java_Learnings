package Oops.ObjectInitialization.Constructors;

public class Test {
    { //Initializer Block
        System.out.println("This block will be called even before constructor");
    }

    Test() { //Constructor without any parameter
        System.out.println("This is User-Defined Constructor");
    }

    Test(String name) {  //Constructor with parameter
        System.out.println("This is Parameterized Constructor");
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test("Srijan");
    }
}
