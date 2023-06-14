package Oops.Polymorphism.MethodOverloading;

public class Test {
    void show() {
        System.out.println("No arg method");
    }

    void show(String name) {
        System.out.println("Myname is: " + name);
    }

    public static void main(String[] args) {
        Test t1=new Test();
        t1.show();
        t1.show("Srijan");
    }
}
