package topinterviewquestions.easy.sortingandsearching;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        for (int i = 0; i < m + n; i++) {
            if (p1 < 0) {
                nums1[m + n - i - 1] = nums2[p2];
                p2--;
                continue;
            }
            if (p2 < 0 || nums1[p1] > nums2[p2]) {
                nums1[m + n - i - 1] = nums1[p1];
                p1--;
            } else {
                nums1[m + n - i - 1] = nums2[p2];
                p2--;
            }
        }
    }
}
