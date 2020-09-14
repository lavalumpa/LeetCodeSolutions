package topinterviewquestionseasy.arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int length=1;
        int run=0;
        int chase=0;
        if (nums.length==0) return 0;
        while (run<nums.length){
            if (nums[run]>nums[chase]){
                nums[chase+1]=nums[run];
                chase++;
                length++;
            }
            run++;
        }
        return length;
    }
}
