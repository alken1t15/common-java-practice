public class hytrhg {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 9, 2, 5, 6, 8, 2, 1, 876, 345, 123, 324, 765, 234324, 6867};
        //  bubbleSort(arr);
        //selectSort(arr);
        quickSort(arr, 0, arr.length - 1);
        for (int b : arr) {
            System.out.print(b + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        boolean sort = false;
        int temp;
        while (!sort) {
            sort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    sort = false;
                }
            }
        }
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_id = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_id = j;
                }
            }
            if (min_id != i) {
                int temp = arr[i];
                arr[i] = min;
                arr[min_id] = temp;
            }
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int midle = low + (high - low) / 2;
        int opora = arr[midle];

        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < opora) {
                i++;
            }

            while (arr[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(arr, low, j);
        }
        if (high > i) {
            quickSort(arr, i, high);
        }
    }
}