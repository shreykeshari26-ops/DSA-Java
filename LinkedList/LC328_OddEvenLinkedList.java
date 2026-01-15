package LinkedList;

/**
 * LeetCode 328 - Odd Even Linked List
 *
 * Problem:
 * Given the head of a singly linked list, group all the nodes with odd indices
 * together followed by the nodes with even indices.
 *
 * Approach:
 * - Use two dummy nodes to build odd and even lists
 * - Traverse using a position counter
 * - Attach odd list followed by even list
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */


class OddEven {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode tempo = new ListNode(100); // odd dummy
        ListNode tempe = new ListNode(10);  // even dummy

        ListNode odd = tempo;
        ListNode even = tempe;

        ListNode temp = head;
        int p = 1;

        while (temp != null) {
            if (p % 2 != 0) {
                odd.next = temp;
                odd = odd.next;
            } else {
                even.next = temp;
                even = even.next;
            }
            p++;
            temp = temp.next;
        }

        even.next = null;      // terminate even list
        odd.next = tempe.next; // merge odd + even

        return tempo.next;
    }
}

