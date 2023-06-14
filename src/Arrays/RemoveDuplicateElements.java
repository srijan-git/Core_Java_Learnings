package Arrays;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4};
        int len = arr.length;
        int n = removeDuplicate(arr, len);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static int removeDuplicate(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }


        int j = 0;

        for (int i = 0; i < n - 1; i++)
            if (arr[i] != arr[i + 1])
                arr[j++] = arr[i];

        arr[j++] = arr[n - 1];
        return j;
    }

}
