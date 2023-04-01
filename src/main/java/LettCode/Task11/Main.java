package LettCode.Task11;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println(strStr("aaaaa","bba"));
    }

    public static int strStr(String haystack, String needle) {
/*        if(!haystack.contains(needle)){
            return -1;
        }
        else {
            return haystack.indexOf(needle);
        }*/
        return haystack.indexOf(needle);
    }
}
