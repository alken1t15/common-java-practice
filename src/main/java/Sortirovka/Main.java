package Sortirovka;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 7, 2, 6, 8, 1, 4, 6, 8, 0, 17, 14, 53, 532, 74, 21, 77};
        for (int a : arr) {
            System.out.print(" " + a);
        }
        Main.bubbleSort(arr);

        System.out.println();
        for (int a : arr) {
            System.out.print(" " + a);
        }


    }

    /*Следующий метод из программы insertSort.java выполняет сортировку методом
    вставки:

     */
   /* public void insertionSort()
    {
        int in, out;
        for(out=1; out<nElems; out++) // out - разделительный маркер
        {
            long temp = a[out]; // Скопировать помеченный элемент
            in = out; // Начать перемещения с out
            while(in>0 && a[in-1] >= temp) // Пока не найден меньший элемент
            {
                a[in] = a[in-1]; // Сдвинуть элемент вправо
                --in; // Перейти на одну позицию влево
            }
            a[in] = temp; // Вставить помеченный элемент
        }
    }

    */
  /*  public void selectionSort()
    {
        int out, in, min;
        for(out=0; out<nElems-1; out++) // Внешний цикл
        {
            min = out; // Минимум
            for(in=out+1; in<nElems; in++) // Внутренний цикл
                if(a[in] < a[min] ) // Если значение min больше,
                    min = in; // значит, найден новый минимум
            swap(out, min); // Поменять их местами
        }
    }

   */
    //Основной код метода bubbleSort() состоит всего из четырех строк:
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    static void selectionSortt(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    static void insertionSortt(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}