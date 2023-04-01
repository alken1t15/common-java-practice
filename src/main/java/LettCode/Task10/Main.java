package LettCode.Task10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println( isPalindrome(121));
    }
/*    public static boolean isPalindrome(int x) {
        if(x == -1){
            return false;
        }
        ArrayList<Integer> linkedList = new ArrayList<>();
        char[] arr = String.valueOf(x).toCharArray();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]=='-'){
                int c=Integer.parseInt(String.valueOf(arr[0])+arr[i+1]);
                linkedList.add(c);
                i++;
            }
            else {
                linkedList.add(Integer.parseInt(String.valueOf(arr[i])));
            }
        }
        for(int i = 0;i<linkedList.size()-1;i++){
            if (!linkedList.get(i).equals(linkedList.get(linkedList.size()-1-i))) {
                return false;
            }
        }
        return true;
    }*/

    public static boolean isPalindrome(int x) {
        ArrayList<Integer> linkedList = new ArrayList<>();
        String b = String.valueOf(x);
        if(x == -1){
            return false;
        }
        if(x/10 < 0){
            for(int i = 0;i<b.length()-1;i++){
                int c = x % 10;
                if(c < 0 & i != b.length()-2 ){
                    c*=-1;
                }
                linkedList.add(c);
                x/=10;
            }
        }
        else {
            for(int i = 0;i<b.length();i++){
                int c = x % 10;
                if(c < 0 & i != b.length()-2 ){
                    c*=-1;
                }
                linkedList.add(c);
                x/=10;
            }
        }
        for(int i = 0;i<linkedList.size()-1;i++){
            if (!linkedList.get(i).equals(linkedList.get(linkedList.size()-1-i))) {
                return false;
            }
        }
        return true;
    }

}
