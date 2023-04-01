package SortedTask;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 3, 2, 9, 676, 876, 34, 12, 68, 43};
        // selectSort(arr);
        //bubbleSort(arr);
        // insertionSort(arr);
        quickSort(arr, 0, arr.length - 1);
        for (int a : arr) {
            System.out.println(a);
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
            if (i != min_id) {
                int temp = arr[i];
                arr[i] = min;
                arr[min_id] = temp;
            }
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

    public static void quickSort(int[] array, int low, int hight) {
        if (array.length == 0) {
            return;
        }
        if (low >= hight) {
            return;
        }
        int midle = low + (hight - low) / 2;
        int opora = array[midle];
        int i = low, j = hight;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[i] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(array, low, j);
        }
        if (hight > i) {
            quickSort(array, i, hight);
        }
    }
}