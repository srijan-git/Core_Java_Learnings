package Strings;

public class StringDemo {
    public static void main(String[] args) {
        /*
        // Declare String without using new operator
        String s = "GeeksforGeeks";

        // Prints the String.
        System.out.println("String s = " + s);

        // Declare String using new operator
        String s1 = new String("GeeksforGeeks");

        // Prints the String.
        System.out.println("String s1 = " + s1);
        */


        /*
        //Difference btw Strings and StringBuffer

        String name = new String("Srijan");
        name.concat("Khan");
        System.out.println("After concatinating the String: " + name);

        StringBuffer sb = new StringBuffer("Kankana");
        sb.append("Das");
        System.out.println("After Appending a String: " + sb);



        //StringBuffer can store by default 16 characters

        StringBuffer sb = new StringBuffer("Srijan"); //Another way we can set capacity like StringBuffer(100)
        System.out.println(sb.capacity()); //It will show output as 22 (16 by default + length of the
        // String literals)


        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.capacity());            //16

        //Append method
        sb2.append("String");
        System.out.println(sb2.capacity());            //16

        sb2.append("Srijan khan");
        System.out.println(sb2.capacity());            //(old capacity(16) *2)+2 or (old capacity+1)*2


        //Length method
        System.out.println(sb2.length());
        */


        /*
        //String Builder
        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1.capacity());
        //In StringBuilder all the methods that it have are non-synchronized
        */

    }
}
