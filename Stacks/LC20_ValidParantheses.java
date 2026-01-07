package Stacks;
import java.util.*;
/*
Problem: Valid Parentheses
Source: LeetCode
Topic: Stack
Difficulty: Easy

Approach:
- Use a stack to store opening brackets.
- For every closing bracket:
  - If stack is empty → invalid
  - If top does not match → invalid
  - Else pop the stack
- String is valid if stack is empty at the end.

Time Complexity: O(n)
Space Complexity: O(n)

Learning:
- Stack helps validate ordered pairs.
- Always check stack before peek/pop.
*/
class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            if(ch=='(' || ch=='['|| ch=='{'){
                st.push(ch);
            }
            else {
                // stack empty check
                if (st.isEmpty()) return false;

                // match check
                if ((ch == ')' && st.peek() != '(') ||
                        (ch == ']' && st.peek() != '[') ||
                        (ch == '}' && st.peek() != '{')) {
                    return false;
                }

                // pop if matched
                st.pop();
            }
        }

        // stack must be empty at end
        return st.isEmpty();
    }
}