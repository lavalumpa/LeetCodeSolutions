package topinterviewquestions.easy.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if (nums1.length>nums2.length) {
            return inter(nums2,nums1);
        }
        else {
            return inter(nums1,nums2);
        }
    }

    public int[] inter(int[]smaller,int[]bigger) {
        int j=0;
        List<Integer> result=new ArrayList<>();
        for (int i=0; i<bigger.length && j<smaller.length;i++){
            if (bigger[i]>=smaller[j]){

                while ( j<smaller.length && i<bigger.length && smaller[j]<=bigger[i]){
                    if (smaller[j]==bigger[i]){
                        result.add(bigger[i++]);
                        j++;
                    } else {
                        j++;
                    }
                }
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }

}
