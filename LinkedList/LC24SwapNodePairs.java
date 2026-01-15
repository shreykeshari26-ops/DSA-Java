package LinkedList;


/**
 * Swap Nodes in Pairs (LeetCode 24)
 *
 * Problem:
 * Swap every two adjacent nodes in a linked list and return its head.
 *
 * Solution:
 * Use a dummy node and pointer manipulation to swap nodes in pairs
 * without changing node values.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class LC24SwapNodePairs {
    public ListNode swapPairs(ListNode head) {

        // Dummy node to handle head swap
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Pointer to connect swapped pairs
        ListNode t = dummy;

        // Pointer to traverse list
        ListNode temp = head;

        // Stores next pair start
        ListNode temp2 = head;

        while (temp != null && temp.next != null) {

            // Link second node
            t.next = temp.next;

            // Save next pair
            temp2 = temp.next.next;

            // Swap pair
            t = t.next;
            t.next = temp;

            // Connect remaining list
            t = t.next;
            t.next = temp2;

            // Move to next pair
            temp = temp2;
        }

        return dummy.next;
    }
}
