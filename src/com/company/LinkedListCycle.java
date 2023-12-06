package com.company;

/*
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
 */
public class LinkedListCycle {

    public static void main(String[] args){
        ListNode node3 = new ListNode(-4);
        ListNode node2 = new ListNode(0, node3);
        ListNode node1 = new ListNode(2, node2);
        node3.next = node1;
        ListNode head = new ListNode(1, node1);
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slowRunner = head;
        ListNode fastRunner = head.next;
        while (fastRunner != null && fastRunner.next != null) {
          if (slowRunner == fastRunner) {
              return true;
          }
          slowRunner = slowRunner.next;
          fastRunner = fastRunner.next.next;
        }
        return false;
    }


    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
