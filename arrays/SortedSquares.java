package arrays;

package arrays;

/*
Problem: Squares of a Sorted Array
Source: LeetCode
Topic: Arrays
Difficulty: Easy

Approach:
1. First square each element of the array.
2. Then sort the array using Bubble Sort.

Algorithm:
- Traverse the array and replace each element with its square.
- Use Bubble Sort to sort the squared elements in ascending order.
- Return the sorted array.

Time Complexity:
- Squaring elements: O(n)
- Bubble Sort: O(n^2)
- Overall: O(n^2)

Space Complexity:
- O(1) (sorting done in-place)

Learning:
- Squaring negative numbers breaks the sorted order.
- Simple sorting works but is inefficient.
- This problem can be optimized to O(n) using the two-pointer technique.
*/

class Solution {
    public int[] sortedSquares(int[] nums) {

        // Step 1: Square each element
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // Step 2: Sort using Bubble Sort
        for (int pass = 0; pass < nums.length; pass++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }

        return nums;
    }
}

