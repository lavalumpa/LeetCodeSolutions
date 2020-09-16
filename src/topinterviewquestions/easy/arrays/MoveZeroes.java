package topinterviewquestions.easy.arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int notzero=0;
        for (int i=0; i<nums.length;i++){
            if (nums[i]!=0){
                nums[notzero++]=nums[i];
            }
        }
        while (notzero<nums.length){
            nums[notzero++]=0;
        }
    }
}
