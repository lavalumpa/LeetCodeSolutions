package topinterviewquestions.easy.dynamicprogramming;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE;
        int sum2=0;
        for (int i=0; i<nums.length;i++){
            if (sum2<0 && nums[i]>sum2){
                sum2=nums[i];
            } else {
                sum2+=nums[i];
            }
            if (sum<sum2){
                sum=sum2;
            }
        }
        return sum;
    }
}
