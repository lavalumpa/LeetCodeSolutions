package topinterviewquestions.easy.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> put = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!put.contains(nums[i])) {
                put.add(nums[i]);
            } else return true;
        }
        return false;
    }
}
