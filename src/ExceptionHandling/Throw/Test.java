package ExceptionHandling.Throw;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.divide();
        throw new ArithmeticException(); //Throw keyword throws the exception created by programmer to the JVM
    }                                   //Throw keyword mainly used in custom  or user defined exceptions

    void divide() {
        int a = 100, b = 0, c;
        c = a / b;
        System.out.println(c);
    }
}
