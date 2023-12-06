package com.company;

public class PalindromeLL {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2));
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        ListNode originalMiddle = head;
        int size = 1;
        ListNode tail = null;
        ListNode currNode = originalMiddle;
        while (head.next != null) {
            head = head.next;
            if ((size & 1) == 1) {
                originalMiddle = originalMiddle.next;
                //create tail
                currNode.next = tail;
                tail = currNode;
                //what's current?
                currNode = originalMiddle;
            }
            size++;
        }
        if ((size & 1) == 1) {
            originalMiddle = originalMiddle.next;
        }
        do {
            if (originalMiddle.val != tail.val) {
                return false;
            }
            originalMiddle = originalMiddle.next;
            tail = tail.next;
        } while (originalMiddle != null);
        return true;
    }

    public static ListNode reverse(ListNode head) {
        ListNode tail = null;
        ListNode currNode = head;
        while (head.next != null) {
            head = head.next;
            currNode.next = tail;
            tail = currNode;
            currNode = head;
        }
        currNode.next = tail;
        tail = currNode;
        return tail;
    }

    /*
    private ListNode frontPointer;

    private boolean recursivelyCheck(ListNode currentNode) {
        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next)) return false;
            if (currentNode.val != frontPointer.val) return false;
            frontPointer = frontPointer.next;
        }
        return true;
    }

    public boolean isPalindrome(ListNode head) {
        frontPointer = head;
        return recursivelyCheck(head);
    }
     */
}
