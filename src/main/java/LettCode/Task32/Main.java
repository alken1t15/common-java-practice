package LettCode.Task32;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(arr,34));

    }

/*    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int b : num){
            stringBuilder.append(b);
        }
        BigInteger b = new BigInteger(String.valueOf(stringBuilder)).add(BigInteger.valueOf(k));
        stringBuilder.setLength(0);
        stringBuilder.append(b);
        for(int i=0;i<stringBuilder.length();i++){
            arrayList.add(Integer.valueOf(String.valueOf(stringBuilder.charAt(i))));
        }
        return arrayList;
    }*/

    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int b : num){
            stringBuilder.append(b);
        }
        BigInteger b = new BigInteger(String.valueOf(stringBuilder)).add(BigInteger.valueOf(k));
        stringBuilder.setLength(0);
        stringBuilder.append(b);
        for(int i=0;i<stringBuilder.length();i++){
            arrayList.add(Integer.valueOf(String.valueOf(stringBuilder.charAt(i))));
        }
        return arrayList;
    }
}