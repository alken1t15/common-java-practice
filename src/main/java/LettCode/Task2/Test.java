package LettCode.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) {
        int[][] arr = {{1, 5}, {7, 3}, {3, 5}};
       // int b =maximumWealth(arr);
       // System.out.println(b);
        System.out.println(654);
    }

    public  int maximumWealth(int[][] accounts) {
        int [] arr = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {  //идём по строкам
            for (int j = 0; j < accounts[0].length; j++) {//идём по столбцам
                System.out.print(" " + accounts[i][j] + " "); //вывод элемента
                arr[i] += accounts[i][j];
            }
        }
        int temp = arr[0];
        for(int i = 0; i< arr.length;i++){
            if(arr[i]>temp){
                temp = arr[i];
            }
        }
        return temp;
    }
}
