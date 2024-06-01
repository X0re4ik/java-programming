package leetcode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/valid-anagram/description/

public class Task242 {
    
    // 242. Valid Anagram

    static public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> counter = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            counter.put(ch, counter.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!counter.containsKey(ch) || counter.get(ch) == 0) {
                return false;
            }
            counter.put(ch, counter.get(ch) - 1);
        }

        return true;        
    }
    
    public static void main(String[] args) {
        System.out.println("anagram and nagaram -> " + isAnagram("anagram", "nagaram"));
        System.out.println("ilikejava and sbkjfbsifiu -> " + isAnagram("ilikejava", "sbkjfbsifiu"));
        System.out.println("aka and aka -> " + isAnagram("aka", "aka"));
    }
}
