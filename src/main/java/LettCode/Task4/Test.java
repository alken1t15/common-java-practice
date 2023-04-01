package LettCode.Task4;

public class Test {
    public static void main(String[] args) {
        int arr = 123;
        //System.out.println(numberOfSteps(arr));
    }


    public  int numberOfSteps(int num) {
        int temp = 0;
        int result = num;
        for (int i = 1; result != 0; ++i) {
            if (result % 2 == 0) {
                result= result/2;
            }
            else {
                result -= 1;
            }
            temp = i;
        }
        return temp;
    }
}
