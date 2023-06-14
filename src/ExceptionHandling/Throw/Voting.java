package ExceptionHandling.Throw;

import java.util.Scanner;

class YoungerAgeException extends RuntimeException {  //Most of the time we create customized exception
                                                    //in RuntimeException or unchecked exception category
    YoungerAgeException(String msg) {
        super(msg);
    }
}

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new YoungerAgeException("Your are not eligible for Voting: ");
                //System.out.println("Hiiii");//This will not be executed
            } else {
                System.out.println("You can vote");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello");
    }
}
