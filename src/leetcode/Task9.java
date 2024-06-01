package leetcode;

// + 
// https://leetcode.com/problems/palindrome-number/description/

public class Task9 {
    // 9. Palindrome Number
    static public boolean isPalindrome(int x) {
        String numberAsString = String.valueOf(x);
        return isPalindrome(numberAsString);
    }

    static public boolean isPalindrome(String str) {
        int middle = str.length();
        for (int i = 0; i < middle; ++i) {
            boolean condition = str.charAt(i) != str.charAt(str.length() - 1 - i);
            if (condition) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("121: " + isPalindrome(121)); // true
        System.out.println("222: " + isPalindrome(222)); // true 
        System.out.println("1212: " + isPalindrome(1212)); // false 
    }
}
