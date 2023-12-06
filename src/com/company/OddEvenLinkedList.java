package com.company;

public class OddEvenLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8))))))));
        System.out.println(oddEvenList(head));
    }

    public static ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode evenHead = head.next;
        ListNode even = evenHead;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}

//    public static ListNode recursionSort(ListNode prevNode, ListNode curr) {
//        if (curr != null) {
//            size++;
//            prevNode.next = recursionSort(curr, curr.next);
//        }
//        if (size % 2 == 0) {
//
//        }
//        return prevNode;
//    }
//}
