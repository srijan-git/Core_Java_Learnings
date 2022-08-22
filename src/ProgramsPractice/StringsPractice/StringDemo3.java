package ProgramsPractice.StringsPractice;

public class StringDemo3 {
    //Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
    public static void main(String[] args) {
        String str1 = "Java Excercise 1";
        String str2 = "Java Excercise 2";

        System.out.println("String 1: " + str1 + "\nString 2: " + str2);
        int result = str1.compareTo(str2);
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
