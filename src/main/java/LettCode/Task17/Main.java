package LettCode.Task17;

import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array  = new int[]{7,9};
        array= plusOne3(array);
        for(int b : array){
            System.out.print(b+" ");
        }
    }
    public static int[] plusOne(int[] digits) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int b : digits){
            stringBuilder.append(b);
        }
        BigInteger  bigInteger = new BigInteger(String.valueOf(stringBuilder)).add(BigInteger.valueOf(1));
        stringBuilder.delete(0,stringBuilder.length());
        stringBuilder.append(bigInteger);
       try {
           for (int i = 0; i < stringBuilder.length(); i++) {
               digits[i] = Integer.parseInt(String.valueOf(stringBuilder.charAt(i)));
           }
       }catch (ArrayIndexOutOfBoundsException e){
           int[] arr = new int[digits.length+1];
           for (int i = 0; i < stringBuilder.length(); i++) {
               arr[i] = Integer.parseInt(String.valueOf(stringBuilder.charAt(i)));
           }
           return arr;
       }
        return digits;
    }

    public static int[] plusOne2(int[] digits) {
        int temp = digits[digits.length-1];
        if(temp<9){
            temp+=1;
            digits[digits.length-1] = temp;
        }
        else{
            for(int i= digits.length-1; i>= 0;i--){
                if(digits[i] == 9){
                    digits[i] = 0;
                    digits[i-1] =digits[i-1]+1;
                }
            }
        }
        return digits;
    }

    public static int[] plusOne3(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNo = new int [n+1];
        newNo[0] = 1;

        return newNo;
    }
}
