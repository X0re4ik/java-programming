package leetcode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// +
// https://leetcode.com/problems/two-sum/

public class Task1 {

    // 1. Two Sum

    static public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] answer1 = twoSum(nums, 9);
        System.out.println(Arrays.toString(answer1)); // [0,1]

        int[] nums2 = {3, 2, 4};
        int[] answer2 = twoSum(nums2, 6);
        System.out.println(Arrays.toString(answer2)); // [1, 2]
    }
}