package arrays;

/*
Problem: Two Sum
Source: LeetCode
Topic: Arrays
Approach: Brute Force using nested loops
Time Complexity: O(n^2)
Space Complexity: O(1)

Learning:
- Check all unique pairs (i < j)
- Simple but inefficient for large inputs
- Can be optimized using HashMap
*/

    class Solution {
        public int[] twoSum(int[] nums, int target) {

            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {

                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }

                }
            }

            return new int[]{-1, -1};
        }
    }




