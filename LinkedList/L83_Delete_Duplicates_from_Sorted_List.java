
package LinkedList;


// LeetCode 83: Delete Duplicates from Sorted List
class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode temp = head;

        while (temp != null && temp.next != null) {

            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}
