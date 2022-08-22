package InputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) throws IOException {

        //Scanner Class
        Scanner sc = new Scanner(System.in);


        //Integer value
        System.out.println("Enter a value");
        int val = sc.nextInt();
        System.out.println("The user given input is: " + val);

        //String Value
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        System.out.println("The user given input is: " + str);


        //Character Value
        System.out.println("Enter a String:");
        char ch = sc.next().charAt(0);
        System.out.println("The user given input is: " + ch);

        //BufferReader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.println("Enter a value: ");
        int value = Integer.parseInt(br.readLine());
        System.out.println("The value is: " + value);


    }
}
