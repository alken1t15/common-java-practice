package Book3.Task7;

public class Min {
    public static void main(String[] args) {
       // System.out.println(fact(3));
        int [] array = new int[]{10, 2, 10, 3, 1, 2, 5};
        selectSort(array);
        for(int f : array){
            System.out.println(f);
        }
    }

    public static int fact(int a){
        if(a == 1)
            return a;
        return a * fact(a-1);
    }


    public static void selectSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int min = arr[i];
            int min_id = i;
            for(int j = i + 1;j<arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    min_id = j;
                }
            }
            if(min_id != i){
                int temp = arr[i];
                arr[i] = min;
                arr[min_id] = temp;
            }
        }
    }
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
    }




    public void bistri(int[] array, int low, int high){
        if(array.length ==0){
            return;
        }
        if(low>= high){
            return;
        }
        int midle = low + (high-low)/2;
        int opora = array[midle];

        int i = low, j = high;
        while (i <= j){
            while (array[i] < opora){
                i++;
            }
            while (array[j] > opora){
                j--;
            }

            if(i<=j){
                int temp = array[i];
                array[i] = array[j];
                array[i] = temp;
                i++;
                j--;
            }
        }

    }

}
