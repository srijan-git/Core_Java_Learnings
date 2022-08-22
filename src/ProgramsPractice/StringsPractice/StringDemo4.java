package ProgramsPractice.StringsPractice;

public class StringDemo4 {
    //Write a Java program to compare two strings lexicographically, ignoring case differences.
    public static void main(String[] args) {
        String str1 = "Java Exercise 1";
        String str2 = "Java Exercise 2";

        System.out.println("String 1: " + str1 + "\nString 2: " + str2);

        int result = str1.compareToIgnoreCase(str2);
        if (result < 0) {
            System.out.println("\"" + str1 + "\"" +
                    " is less than " +
                    "\"" + str2 + "\"");
        } else if (result == 0) {
            System.out.println("\"" + str1 + "\"" +
                    " is equals to " +
                    "\"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\"" +
                    " is greater than " +
                    "\"" + str2 + "\"");
        }

    }
}
