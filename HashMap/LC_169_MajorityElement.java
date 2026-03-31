package HashMap;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {

        // Create HashMap to store frequency
        Map<Integer, Integer> max = new HashMap<>();

        for (int el : nums) {
            // check if key is present
            if (!max.containsKey(el)) {
                max.put(el, 1);
            } else {
                // when key is present then update value
                max.put(el, max.get(el) + 1);
            }
        }

        // Debug print (remove before final submission on LeetCode)
        // System.out.println(max);

        // Finding majority element (> n/2)
        int n = nums.length;
        for (int key : max.keySet()) {
            if (max.get(key) > n / 2) {
                return key;
            }
        }

        return -1; // not needed for LeetCode 169, but safe
    }
}