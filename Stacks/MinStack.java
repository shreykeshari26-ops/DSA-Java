package Stacks;

/*
Problem: Min Stack
Source: LeetCode
Topic: Stack
Difficulty: Medium

Problem Statement:
Design a stack that supports push, pop, top, and retrieving the minimum
element in constant time.

Approach: Two Arrays
- Use one array to store the actual stack values.
- Use another array to store the minimum value at each index.
- While pushing, store the minimum so far at the same index in minArr.

Algorithm:
1. Initialize two arrays:
   - arr[] → stores stack elements
   - minArr[] → stores minimum element up to that index
2. Maintain an index pointer (idx) for the stack top.
3. push(val):
   - Store val in arr[idx]
   - If idx == 0, minArr[idx] = val
   - Else minArr[idx] = min(val, minArr[idx - 1])
   - Increment idx
4. pop():
   - Decrement idx if stack is not empty
5. top():
   - Return arr[idx - 1] if stack is not empty
6. getMin():
   - Return minArr[idx - 1] if stack is not empty

Time Complexity:
- push(): O(1)
- pop(): O(1)
- top(): O(1)
- getMin(): O(1)

Space Complexity:
- O(n), due to two arrays storing stack values and minimums

Learning:
- Tracking minimum values alongside stack elements enables O(1) getMin()
- Auxiliary data structures help optimize time complexity
- Trade-off between space and time is often necessary
*/

class MinStack {

    int[] arr = new int[100];
    int[] minArr = new int[100];
    int idx = 0;

    public MinStack() {
        // constructor
    }

    public void push(int val) {
        arr[idx] = val;

        if (idx == 0) {
            minArr[idx] = val;
        } else {
            minArr[idx] = Math.min(val, minArr[idx - 1]);
        }

        idx++;
    }

    public void pop() {
        if (idx == 0) return;
        idx--;
    }

    public int top() {
        if (idx == 0) return -1;
        return arr[idx - 1];
    }

    public int getMin() {
        if (idx == 0) return -1;
        return minArr[idx - 1];
    }
}
