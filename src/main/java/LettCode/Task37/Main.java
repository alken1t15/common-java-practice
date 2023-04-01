package LettCode.Task37;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 0, 0, 0};
        int[] arr2 = new int[]{2, 5, 6};
        merge(arr, 3, arr2, 3);
        for (int c : arr) {
            System.out.print(c + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int b : nums1) {
            if(b!=0) {
                arrayList.add(b);
            }
        }
        for (int c : nums2) {
            if(c!=0) {
                arrayList.add(c);
            }
        }
        Collections.sort(arrayList);
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = arrayList.get(i);

        }
        System.out.println(arrayList);

    }
}
