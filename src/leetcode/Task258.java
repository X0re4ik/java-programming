package leetcode;
// +
// https://leetcode.com/problems/add-digits/description/
public class Task258 {

    // 258. Add Digits
    
    static public int addDigits(int n) {
        if(n < 10) return n;
        int ans = 0;
        while(n != 0) {
             ans = ans + (n % 10);
             n /= 10;
        } 
        return addDigits(ans);
    }

    public static void main(String[] args) {
        System.out.println("24 -> " + addDigits(24)); // 6
        System.out.println("435 -> " + addDigits(435)); // 3
        System.out.println("1034 -> " + addDigits(1034)); // 8
    }
}
