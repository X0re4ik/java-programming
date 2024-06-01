package leetcode;
import java.util.Arrays;
// +
// https://leetcode.com/problems/missing-number/description/

public class Task268 {

    // 268. Missing Number

    static public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }
        return nums[nums.length - 1] + 1;
    }


    public static void main(String[] args) {
        int[] num1 = {1, 2, 23, 12, 34, 0};
        int[] num2 = {1, 2, 3, 4, 21};
        int[] num3 = {1, 2, 3, 5};
        System.out.println(Arrays.toString(num1) + " -> " + missingNumber(num1)); // 3
        System.out.println(Arrays.toString(num2) + " -> " + missingNumber(num2)); // 0
        System.out.println(Arrays.toString(num3) + " -> " + missingNumber(num3)); // 0

    }
}
