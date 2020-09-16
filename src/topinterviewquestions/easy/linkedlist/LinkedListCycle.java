package topinterviewquestions.easy.linkedlist;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode runner=head;
        ListNode chaser=runner;
        while (runner!=null){
            if (runner.next!=null)
                runner=runner.next.next;
            else
                return false;
            chaser=chaser.next;
            if (runner==chaser) return true;
        }
        return false;
    }
}
