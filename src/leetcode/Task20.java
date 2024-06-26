package leetcode;

import java.util.Stack;
// +
// https://leetcode.com/problems/valid-parentheses/description/

public class Task20 {
    static public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>(); 
        for (char c : s.toCharArray()) {
            if (c == '(') 
                stack.push(')');
            else if (c == '{') 
                stack.push('}'); 
            else if (c == '[') 
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println("Example #1 '()[]': " + isValid("()[]"));
        System.out.println("Example #1 '(){]': " + isValid("(){]"));
    }
}
