package LettCode.Task33;

import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        int[] arr = new int[]{0,0};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        int b=0;
        for(int e : arr){
            hashSet.add(e);
            if(e==0){
                b++;
            }
        }
        for(int e: hashSet){
            int c = e*2;
            if(hashSet.contains(c)){
                if(c!=0)
                    return true;
            }
        }
        return b > 1;

/*        int b=0;
        for(int i = 0;i< arr.length-1;i++){
            int c = Math.max(arr[i],arr[i+1] );
            if(c>b){
                b=c;
            }
        }
        for(int c: arr){
            if(c*2==b){
                return true;
            }
        }
        return false;*/
    }
}
/*
    HashSet<Integer> hashSet = new HashSet<>();
        for(int b : arr){
                hashSet.add(b);
                }
                for(int b: hashSet){
                int c = b*2;
                if(hashSet.contains(c)){
                if(c>0)
                return true;
                }
                }
                return false;*/
