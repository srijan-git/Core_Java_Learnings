package ProgramsPractice.StringsPractice;

public class StringDemo9 {
    //Java Program to count the total number of vowels and consonants in a string
    public static void main(String[] args) {
        String s1 = "This is a really simple sentence";
        int vCount = 0, cCount = 0;


        //Approach 1
        String str = s1.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            }
        }
        System.out.println("Number of Vowels: " + vCount + "\nNumber of Consonent: " + cCount);


        //Approach 2
//        String str = s1.toLowerCase();
//        String str1 = str.replaceAll(" ", "");
//        for (int i = 0; i < str1.length(); i++) {
//            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i'
//                    || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {
//                vCount++;
//            } else {
//                cCount++;
//            }
//        }
//        System.out.println("Number of Vowels: " + vCount + "\nNumber of Consonent: " + cCount);
    }
}
