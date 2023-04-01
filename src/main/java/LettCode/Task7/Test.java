package LettCode.Task7;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Test().isPalindrome(1210));
    }
    //1000021
    public boolean isPalindrome(int x) {
        StringBuilder b = new StringBuilder(String.valueOf(x));
        if(b.length()%2!=0){
            b.append("0");
        }
        StringBuilder e = new StringBuilder(b);
        e.delete(b.length()/2,b.length());
        b.delete(0,b.length()/2);
        //b.deleteCharAt(b.length());
        if(e==b){
            return true;
        }
        System.out.println(e);
        System.out.println(b);
        /*char[] arr = b.toCharArray();
            int c = arr[0];
            if (arr[0] == '-') {
                c = Integer.parseInt(String.valueOf(arr[0]) + arr[1]);
                System.out.println(c);
            }
            if (c == arr[arr.length - 1]) {
                return true;
            }

         */
        return false;
    }
}
