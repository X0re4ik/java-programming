package leetcode;

import java.util.Arrays;
// +
// https://leetcode.com/problems/longest-common-prefix/description/

public class Task14 {

    // 14. Longest Common Prefix

    static public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) return ans.toString();
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Example #1: " + longestCommonPrefix(strs)); // "fl"
        
        String[] strs1 = {"dog","racecar","car"};
        System.out.println("Example #2: " + longestCommonPrefix(strs1)); // ""
    }

}
