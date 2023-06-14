package ProgramsPractice.StringsPractice;

import java.util.Scanner;

public class StringDemo1 {
    // 1. Write a Java program to get the character at the given index within the String.


    public static void main(String[] args) {
        String value = "Java Excercise";

        System.out.println("Enter the index number to get the corresponding String: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The character at position " + a + " is : " + value.charAt(a));
    }
}
