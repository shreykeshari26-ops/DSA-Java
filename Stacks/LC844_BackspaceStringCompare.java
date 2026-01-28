package Stacks;
import java.util.Stack;

/*
 * LeetCode 844: Backspace String Compare
 *
 * Problem:
 * Given two strings s and t, return true if they are equal when both are typed
 * into empty text editors. '#' means a backspace character.
 *
 * Approach:
 * - Use two stacks to simulate typing for both strings.
 * - Push characters when normal letters appear.
 * - Pop from stack when '#' appears (if stack is not empty).
 * - Finally, compare both stacks.
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 */

 class LC844_BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> st = new Stack<>();
        Stack<Character> gt = new Stack<>();

        // Process string s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != '#') {
                st.push(ch);
            } else if (!st.isEmpty()) {
                // '#' removes the last typed character
                st.pop();
            }
        }

        // Process string t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (ch != '#') {
                gt.push(ch);
            } else if (!gt.isEmpty()) {
                gt.pop();
            }
        }

        // Compare final stack states
        return st.equals(gt);
    }
}
