public class Sort2DArrayRows {
    public static void main(String[] args) {
        int[][] inputArray = {
                {4, 9, 1, 6},
                {8, 2, 7, 3},
                {5, 0, 2, 1}
        };
        int[][] sortedArray = new int[inputArray.length][inputArray[0].length];
        // Sort the first row in descending order
        mergeSort(inputArray[0], 0, inputArray[0].length - 1, false);

        // Sort the last row in ascending order
        mergeSort(inputArray[inputArray.length - 1], 0, inputArray[inputArray.length - 1].length - 1, true);

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                sortedArray[i][j] = inputArray[i][j];
            }
        }

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(sortedArray[i][j] + " ");
            }
            System.out.println();
        }


    }


    private static void mergeSort(int[] arr, int low, int high, boolean ascending) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(arr, low, mid, ascending);
            mergeSort(arr, mid + 1, high, ascending);

            merge(arr, low, mid, high, ascending);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high, boolean ascending) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (ascending ? left[i] <= right[j] : left[i] >= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
