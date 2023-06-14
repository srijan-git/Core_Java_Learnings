package ProgramsPractice.StringsPractice;

public class StringDemo6 {
    // Write a Java program to test if a given string contains the specified sequence of char values.
    public static void main(String[] args) {
        String str1 = "PHP Exercises and Python Exercises";
        String str2 = "and";
        System.out.println("String 1: " + str1);
        System.out.println("Specified Character Sequence --> and : " + str1.contains(str2));
    }
}
