package LinkedList;

public class LC61_rotateLL {
    public ListNode rotateRight(ListNode head, int k) {


        if (head == null || head.next == null || k == 0) {
            return head;
        }


        ListNode curr = head;
        int size = 1;

        while (curr.next != null) {
            curr = curr.next;
            size++;
        }

        ListNode tail = curr;  // last node


        k = k % size;
        if (k == 0) return head;


        tail.next = head;


        curr = head;
        for (int i = 0; i < size - k - 1; i++) {
            curr = curr.next;
        }


        ListNode newHead = curr.next;
        curr.next = null;

        return newHead;
    }
}
