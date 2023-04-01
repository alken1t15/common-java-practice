package LettCode.Task36;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        String str1="2";
        String str2 = "3";
        System.out.println(multiply(str1,str2));
    }
    public static String multiply(String num1, String num2) {
        BigInteger bigInteger = new BigInteger(num1).multiply(new BigInteger(num2));
       return String.valueOf(bigInteger);
    }
}
