package LettCode.Task13;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {1,3,5};
        System.out.println(searchInsert(nums, 1));
    }

    public static int searchInsert(int[] nums, int target) {
        if(nums.length -1 == 0){
            if(nums[0]< target){
                return nums.length;
            }
            else {
            return 0;}

        }
        if(nums.length ==2) {
            if (nums[0] < target & target < nums[1]) {
                return 1;
            }else if(nums[1]< target){
                return 2;
            }
            else if (nums[0] >= target) {
                return 0;
            }
        }
        int low=0;
        int high=nums.length;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if(target > nums[nums.length-1]){
                return nums.length;
            }
            else if ( target <= nums[0]){
                return 0;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }else if(nums[mid-1] < target & nums[mid] > target ) {
                return mid;
            }
            else if (nums[mid] > target) {
                high = mid - 1;
            }
            else if (nums[mid] == target) {
                index = mid;
                break;
            }else{
                return mid;
            }
        }
        return index;
    }
}
