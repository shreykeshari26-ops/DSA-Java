package arrays;
package arrays;

/*
Problem: Best Time to Buy and Sell Stock
Source: LeetCode
Topic: Arrays
Difficulty: Easy

Approach: Single Pass (Greedy)
- Track the minimum price so far (best day to buy).
- For each day, calculate profit if sold on that day.
- Update maximum profit whenever a better profit is found.

Algorithm:
1. Initialize minPrice to a very large value.
2. Initialize maxProfit to 0.
3. Traverse the prices array:
   - If current price is smaller than minPrice, update minPrice.
   - Otherwise, calculate profit = current price - minPrice.
   - Update maxProfit if profit is greater.
4. Return maxProfit.

Time Complexity: O(n)
- Single pass through the array.

Space Complexity: O(1)
- Only constant extra variables used.

Learning:
- Always buy before you sell.
- Greedy approach works by keeping track of the minimum value.
- Efficient solution compared to brute force O(n²).
*/

class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];      // best day to buy so far
            } else {
                int profit = prices[i] - minPrice; // sell on current day
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}


