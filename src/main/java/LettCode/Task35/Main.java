package LettCode.Task35;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,0,0,0};
        int[] arr2 = new int[]{2,5,6};
        merge(arr,3,arr2,3);

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<nums2.length;i++){
            int b = nums2[i];
            for(int j =0;j<nums1.length-1;j++){
                if(b>nums1[j] && b<=nums1[j+1]){

                }
            }
        }
    }
}
