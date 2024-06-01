package leetcode;
import java.util.Arrays;
// +
// https://leetcode.com/problems/contains-duplicate/description/
public class Task217 {
    // 217. Contains Duplicate
    static public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] trueNumbers = {1, 2, 2, 3, 5, 6};
        System.out.println(
            Arrays.toString(trueNumbers) + " -> " + containsDuplicate(trueNumbers)
        );

        int[] falseNumbers = {1, 2, 3, 5, 6};
        System.out.println(
            Arrays.toString(falseNumbers) + " -> " + containsDuplicate(falseNumbers)
        );
    }

}
