package LettCode.Task5;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //System.out.println(fizzBuzz(15));
    }

    public  List<String> fizzBuzz(int n) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 1; i<=n;i++){
            if(i%3==0 & i%5==0){
                arr.add("FizzBuzz");
            }
            else if(i%3==0){
                arr.add("Fizz");
            }
            else if(i%5==0){
                arr.add("Buzz");
            }
            else {
                arr.add(String.valueOf(i));
            }
        }

        return arr;
    }
}
