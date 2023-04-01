package LettCode.Task8;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Test().longestCommonPrefix(new String[]{"ab","a"}));
    }

    public String longestCommonPrefix(String[] strs) {
        String temp = strs[0];
        for (int i = 0; i < temp.length(); i++)
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i)
                    return strs[j];
                if (temp.charAt(i) != strs[j].charAt(i))
                    return temp.substring(0, i);
            }
        return temp;
    }
/*        String str;
        int count =0;
        StringBuilder str2 = new StringBuilder(strs[0]);
        for(int i = 0; !str2.isEmpty();i++){
                for(int j = 1; j<strs.length;j++){
                     str = strs[j];
                    if(str.startsWith(String.valueOf(str2))){
                        count++;
                    }
                    if(count==strs.length-1){
                        if(strs[0].startsWith(String.valueOf(str2))){
                            return String.valueOf(str2);
                        }
                    }
                    if(count==i){
                        str2.deleteCharAt(str2.length()-1);
                    }
                }
            }
        return "";*/
/*        int count =0;
       char [] arr = strs[0].toCharArray();
        for(int i = 0;i<arr.length;i++){
            if(i+1 != arr.length){
                String str2= String.valueOf(arr[i]+String.valueOf(arr[i+1]));
                for(int j = 1; j<strs.length;j++){
                    String str = strs[j];
                    if(str.startsWith(str2)){
                        count++;
                    }
                    if(count==strs.length-1){
                        if(strs[0].startsWith(str2)){
                            return str2;
                        }
                        else {
                            count=0;
                        }
                    }
                }
            }
        }*/
/*        for(int i = 0;i<arr.length;i++){
            if(i+1 != arr.length){
                String str2= String.valueOf(arr[i]);
                for(int j = 1; j<strs.length;j++){
                    String str = strs[j];
                    if(str.startsWith(str2)){
                        count++;
                    }
                    if(count==strs.length-1){
                        if(strs[0].startsWith(str2)){
                            return str2;
                        }
                    }
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(i+1 != arr.length){
                String str2= String.valueOf(arr[i]);
                for(int j = 1; j<strs.length;j++){
                    String str = strs[j];
                    if(str.startsWith(str2)){
                        count++;
                    }
                    if(count==strs.length-1){
                        if(strs[0].startsWith(str2)){
                            return str2;
                        }
                    }
                }
            }
        }*/
            // return "";
        }
