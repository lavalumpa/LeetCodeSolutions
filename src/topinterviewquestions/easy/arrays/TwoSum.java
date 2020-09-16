package topinterviewquestions.easy.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> remain = new HashMap<>();
        for (int i=0; i<nums.length;i++){
            remain.put(target-nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            if (remain.containsKey(nums[i]) && remain.get(nums[i])!=i){
                return new int[] {i,remain.get(nums[i])};
            }
        }
        return null;
    }
}
