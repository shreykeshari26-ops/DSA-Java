package arrays;

/**
 * Search Insert Position (LeetCode 35)
 *
 * Problem:
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found.
 * If not, return the index where it would be inserted in order.
 *
 * Approach:
 * - Traverse the array from left to right
 * - Find the first index where nums[i] >= target
 * - Return that index
 * - If target is greater than all elements, return nums.length
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * nums = [1,3,5,6], target = 5 → Output: 2
 * nums = [1,3,5,6], target = 2 → Output: 1
 * nums = [1,3,5,6], target = 7 → Output: 4
 */

class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int idx = 0;

        while (idx < nums.length) {
            if (nums[idx] >= target) {
                return idx;
            }
            idx++;
        }
        return nums.length;
    }
}
