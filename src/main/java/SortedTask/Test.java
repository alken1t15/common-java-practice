package SortedTask;

public class Test {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 3, 2, 1, 676, 876, 34, 12, 68, 43};
        // selectSort(arr);
        bubbleSort(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }


    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_id = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_id = j;
                }
            }
            if (min_id != i) {
                int temp = array[i];
                array[i] = min;
                array[min_id] = temp;
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    sorted = false;
                }
            }
        }
    }

}