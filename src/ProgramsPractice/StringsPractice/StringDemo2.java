package ProgramsPractice.StringsPractice;

public class StringDemo2 {
    // Write a Java program to get the character (Unicode code point) at the given index within the String
    public static void main(String[] args) {
        String str = "Java Excercise";
        int val1 = str.codePointAt(0);
        int val2 = str.codePointAt(5);

        System.out.println("The unicode point of position 0: " + val1);
        System.out.println("The unicode point of position 5: " + val2);
    }
}
