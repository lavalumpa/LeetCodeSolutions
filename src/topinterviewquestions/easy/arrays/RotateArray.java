package topinterviewquestions.easy.arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length - 1;
        int temp = 0;
        k = k % nums.length;
        for (int i = 0; i < nums.length / 2; i++) {
            temp = nums[i];
            nums[i] = nums[n - i];
            nums[n - i] = temp;
        }
        for (int i = 0; i < k / 2 && k < nums.length; i++) {
            temp = nums[k - i - 1];
            nums[k - i - 1] = nums[i];
            nums[i] = temp;
        }
        for (int i = 0; i < (nums.length - k) / 2 && k < nums.length; i++) {
            temp = nums[k + i];
            nums[k + i] = nums[n - i];
            nums[n - i] = temp;
        }
    }
}
