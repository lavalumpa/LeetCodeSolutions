package topinterviewquestions.easy.linkedlist;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        var length=length(head);
        if (length<=1){
            return true;
        }
        var run=head;
        var half=length/2;
        while (half--!=0){
            run=run.next;
        }
        ListNode halfhead=null;
        while (run!=null){
            ListNode temp=new ListNode(run.val);
            temp.next=halfhead;
            halfhead=temp;
            run=run.next;
        }
        run=head;
        while (halfhead!=null){
            if (halfhead.val!=run.val){
                return false;
            }
            halfhead=halfhead.next;
            run=run.next;
        }
        return true;
    }
    public int length(ListNode head){
        int result=0;
        ListNode run=head;
        while (run!=null){
            result++;
            run=run.next;
        }
        return result;
    }
}
