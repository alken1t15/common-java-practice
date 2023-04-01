package LettCode.Task27;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        for(int i=0; i<t.length(); i++){
            if(s.charAt(0) == t.charAt(i)){
                s = s.substring(1);  // next character of string "s"
            }
            if(s.length() == 0){  // if string "s" is completely travelled
                return true;
            }
        }
        return false;  // if string "s" is not completely travelled
    }
}
