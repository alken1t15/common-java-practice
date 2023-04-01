package LettCode.Task3;

public class Test {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        // int[] b =twoSum2(arr,6);
/*        int [] c = new Test.twoSum2()
         for (int c : b){
             System.out.println(c);
         }*/
    }

    public static int[] twoSum(int[] nums, int target) {
        int temp=0;
        for(int i = 0; i<nums.length;i++){
            if (i + 1 != nums.length) {
                temp = nums[i] + nums[i + 1];
                if (temp == target) {
                    return new int[]{i, i + 1};
                }
            }
        }
        return new int[]{0,0};
    }


    public  int[] twoSum2(int[] nums, int target) {
        int temp;
        for(int i = 0; i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                    temp = nums[i] + nums[j];
                    if (temp == target) {
                        return new int[]{i, j};
                    }
            }
        }
        return new int[]{0,0};
    }
}
