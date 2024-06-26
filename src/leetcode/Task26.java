package leetcode;

import java.util.Arrays;
// + 
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class Task26 {
    // 26. Remove Duplicates from Sorted Array
    static public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4};
        System.out.println("Исходный массив: " + Arrays.toString(nums));
        removeDuplicates(nums);
        System.out.println("Конечный массив: " + Arrays.toString(nums));
    }
}
