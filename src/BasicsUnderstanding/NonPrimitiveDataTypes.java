package BasicsUnderstanding;

public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        //There are some ways to create a string

        //Method - 1
        String str = "Test";
        System.out.println("String is: " + str);
        //Here String is going to reuse the same object multiple time and it is memory efficient.

        //Method - 2
        String str1 = new String("Test");
        System.out.println("Another String: " + str1);
        //Here everytime we call this, is going to create a new object


        //Array can store continious sequence of similar type of anything.Arrays are homogeneous in nature;
        //Here anything can be a number,character,floating number etc.;

        int arr[];
        arr = new int[2];

        //Here this syntax means that we are creating a are which will
        // accure the memory space of two integers

        arr[0] = 0;
        arr[1] = 1;

        System.out.println(arr);
        //This will print the memory location of arr.
        System.out.println(arr[1]);


        System.out.println(arr[2]);
        //This will leads us to an error.
    }
}
