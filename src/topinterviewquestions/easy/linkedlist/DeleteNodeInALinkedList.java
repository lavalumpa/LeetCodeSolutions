package topinterviewquestions.easy.linkedlist;

public class DeleteNodeInALinkedList {

    public void deleteNode(ListNode node) {
        if (node.next == null) node = null;
        else {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
