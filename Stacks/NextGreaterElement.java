package Stacks;

/**
 * Next Greater Element I (LeetCode 496)
 *
 * Problem:
 * Given two arrays nums1 and nums2 where nums1 is a subset of nums2,
 * find the next greater element for each element in nums1 based on nums2.
 *
 * The next greater element of x in nums2 is the first greater element
 * to the right of x. If it does not exist, return -1.
 *
 * Approach:
 * 1. Use a monotonic decreasing stack to compute the
 *    Next Greater Element (NGE) for every element in nums2.
 * 2. Store the NGE values in an array aligned with nums2 indices.
 * 3. For each element in nums1, find its index in nums2
 *    and return the precomputed NGE.
 *
 * Time Complexity:
 * - Building NGE for nums2: O(n)
 * - Finding answers for nums1: O(m * n) (linear search)
 *
 * Space Complexity:
 * - O(n) for stack and NGE array
 *
 * Example:
 * nums1 = [4,1,2]
 * nums2 = [1,3,4,2]
 * Output = [-1,3,-1]
 */

import java.util.Stack;

class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums2.length;

        // Step 1: Build NGE array for nums2
        int[] nge2 = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }

            nge2[i] = st.isEmpty() ? -1 : st.peek();
            st.push(nums2[i]);
        }

        // Step 2: Answer for nums1 using index lookup
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            while (nums2[j] != nums1[i]) {
                j++;
            }
            ans[i] = nge2[j];
        }

        return ans;
    }
}
