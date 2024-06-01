package leetcode;
// +
// https://leetcode.com/problems/merge-sorted-array/description/

import java.util.Arrays;

public class Task88 {

    // 88. Merge Sorted Array
    
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (j >= 0) {

            if (i >= 0 && nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
            else nums1[k--] = nums2[j--];

        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        System.out.println(Arrays.toString(nums1));
        int m = 3;
        int[] nums2 = {2, 5, 6};
        System.out.println(Arrays.toString(nums2));
        int n = 3;
        
        merge(nums1, m, nums2, n);
        
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

    }
}
