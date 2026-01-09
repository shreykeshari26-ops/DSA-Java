/**
 * Maximum Subarray (LeetCode 53)
 *
 * Problem:
 * Given an integer array nums, find the contiguous subarray
 * which has the largest sum and return its sum.
 *
 * Approach (Kadane’s Algorithm):
 * - Maintain a running sum (currSum)
 * - Reset currSum to 0 if it becomes negative
 * - Track the maximum sum seen so far
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * nums = {-2,1,-3,4,-1,2,1,-5,4}
 * Output: 6
 */

class Solutions {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;

        for (int x : nums) {
            currSum += x;

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
