package leetcode;
// +
// https://leetcode.com/problems/power-of-two/description/
public class Task231 {

    // 231. Power of Two

    static public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 31; i++) {
            int ans = (int) Math.pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("isPowerOfTwo 32 -> " + isPowerOfTwo(32)); // true
        System.out.println("isPowerOfTwo 1312 -> " + isPowerOfTwo(1312)); // false
    }
}
