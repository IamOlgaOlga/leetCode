package com.company;

public class RemoveNNodeFromTheEnd {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode result = removeNthFromEnd(head, 1);
        System.out.println(result);

    }

    static int flag = 1;

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        return recursiveSearch(head, head.next, n);
    }

    public static ListNode recursiveSearch(ListNode prevNode, ListNode curr, int n) {
        if (curr != null) {
            prevNode.next = recursiveSearch(curr, curr.next, n);
        }
        if (flag == n) {
            prevNode = curr == null ? new ListNode() : curr;
        }
        flag++;
        return prevNode;
    }
}
