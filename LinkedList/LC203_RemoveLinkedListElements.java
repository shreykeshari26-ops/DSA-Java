package LinkedList;

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

/**
 * LeetCode 203 - Remove Linked List Elements
 *
 * Problem:
 * Remove all elements from a linked list of integers that have value val.
 *
 * Approach:
 * - Use a dummy node to simplify head deletion cases
 * - Traverse the list and attach only nodes whose value != val
 * - Cut remaining links at the end
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode temp = head;
        ListNode point = new ListNode(100); // dummy node
        ListNode t = point;

        while (temp != null) {
            if (temp.val != val) {
                t.next = temp;
                t = t.next;
            }
            temp = temp.next;
        }

        t.next = null; // terminate list
        return point.next;
    }
}

