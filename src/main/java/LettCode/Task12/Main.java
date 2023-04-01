package LettCode.Task12;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{-3,-1,0,0,0,3,3};
        removeDuplicates(nums);
        for(int j : nums){
            System.out.println(j);
        }
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> hashSet = new LinkedHashSet<>();
        for(int i : nums){
            hashSet.add(i);
        }
        Iterator<Integer> i = hashSet.iterator();
        int j = 0;
        while (i.hasNext()) {
            nums[j] =i.next();
            j++;
        }
        return hashSet.size();
    }
}
