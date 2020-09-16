package topinterviewquestions.easy.linkedlist;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while (head != null) {
            temp = head;
            head = head.next;
            temp.next = prev;
            prev = temp;
        }
        return temp;
    }
}
