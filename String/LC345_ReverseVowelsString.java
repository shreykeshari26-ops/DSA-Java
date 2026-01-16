package String;

/**
 * LeetCode 345 - Reverse Vowels of a String
 *
 * Approach:
 * - Two pointers (left & right)
 * - Move pointers until vowels are found
 * - Swap vowels
 * - Continue until pointers cross
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class LC345isVowel {

    boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public String reverseVowels(String s) {

        char[] arr = s.toCharArray(); // convert string to mutable array
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            // swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}
