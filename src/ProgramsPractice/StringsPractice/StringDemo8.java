package ProgramsPractice.StringsPractice;

public class StringDemo8 {
    //Java Program to Count the Total Number of Punctuation Characters Exists in a String
    public static void main(String[] args) {
        int count = 0;
        String str1 = "He said, 'The mailman loves you.' I heard it with my own ears.";

        System.out.println("The Total number of Punctuation: ");

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == '!' || str1.charAt(i) == ',' || str1.charAt(i) == ';' || str1.charAt(i) == '.' || str1.charAt(i) == '?' || str1.charAt(i) == '-' ||
                    str1.charAt(i) == '\'' || str1.charAt(i) == '\"' || str1.charAt(i) == ':') {
                count++;
            }
        }
        System.out.println("The total number of Punctuation is: " + count);
    }
}
