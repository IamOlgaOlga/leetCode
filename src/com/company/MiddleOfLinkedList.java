package com.company;

public class MiddleOfLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(middleNode(head).val);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode middle = head;
        int size = 1;
        while (head.next != null) {
            head = head.next;
            size ++;
            if ((size & 1) == 0 ) {
                middle = middle.next;
            }
        }
        return middle;
    }

    private static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
