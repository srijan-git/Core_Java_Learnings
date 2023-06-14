package Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayReverseInDecending {
    public static void main(String[] args) {


        /*       Method 1
        // Initializing the array
        Integer array[] = {1, 2, 3, 4, 5};

        // Sorting the array in descending order
        Arrays.sort(array, Collections.reverseOrder());

        // Printing the elements
        System.out.println(Arrays.toString(array));
      */

        int[] arr = {1, 2, 3, 4, 5};
        reverseInDecending(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseInDecending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
}
