package topinterviewquestions.easy.linkedlist;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy= new ListNode(0,head);
        ListNode runner=dummy;
        ListNode chaser=dummy;
        while (n--+1>0)runner=runner.next;
        while (runner!=null){
            runner=runner.next;
            chaser=chaser.next;
        }
        chaser.next=chaser.next.next;
        return dummy.next;
    }

}
