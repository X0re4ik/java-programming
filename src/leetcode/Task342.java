
package leetcode;
// +
// https://leetcode.com/problems/missing-number/description/

public class Task342 {

    // 268. Missing Number

    static public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        return Math.log(n) / Math.log(4) % 1 == 0;        
    }


    public static void main(String[] args) {
        System.out.println("4 -> " + isPowerOfFour(4)); // true
        System.out.println("2 -> " + isPowerOfFour(2)); // false
        System.out.println("3 -> " + isPowerOfFour(3)); // false
        System.out.println("16 -> " + isPowerOfFour(16)); // true

    }
}
