package LinkedList;

/**
 * Definition for singly-linked list.
 */

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
class lc203 {
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

