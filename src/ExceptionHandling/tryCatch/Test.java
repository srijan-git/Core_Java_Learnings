package ExceptionHandling.tryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {

        // FileInputStream fis = new FileInputStream("abc.java");
        //Class.forName("com.mysql.jdbc.driver");

        try { //This mainly handles abnormal termination of the program
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            //Printing techniques
            System.out.println(e);
            e.printStackTrace(); //Most effective one for printing Exception
            System.out.println(e.getMessage());
            System.out.println(e.toString());

        }
        //System.out.println("Hello");
    }
}
