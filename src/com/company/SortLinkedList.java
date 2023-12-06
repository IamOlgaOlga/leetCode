package com.company;

import java.util.List;

public class SortLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    }

    /**
     * Merge Sort:  O(nlog(n))
     * Quicksort is also one of the efficient algorithms with the average time complexity of O(nlogn).
     * But the worst-case time complexity is O(n^2). Also, variations of the quick sort like randomized quicksort
     * are not efficient for the linked list because unlike arrays,
     * random access in the linked list is not possible in O(1) time.
     * If we sort the linked list using quicksort, we would end up using the head as a pivot element
     * which may not be efficient in all scenarios.
     */
    public static ListNode sortList(ListNode head) {
        return topDownMergeSort(head);
    }

    /**
     * Merge sort is a popularly known algorithm that follows the Divide and Conquer Strategy.
     * The divide and conquer strategy can be split into 2 phases:
     *
     * Divide phase: Divide the problem into subproblems.
     *
     * Conquer phase: Repeatedly solve each subproblem independently and combine the result to form the original problem.
     * The Top Down approach for merge sort recursively splits the original list into sublists of equal sizes,
     * sorts each sublist independently, and eventually merge the sorted lists.
     * Let's look at the algorithm to implement merge sort in Top Down Fashion.
     *
     * Algorithm
     *
     * -- Recursively split the original list into two halves.
     *  The split continues until there is only one node in the linked list (Divide phase).
     *  To split the list into two halves, we find the middle of the linked list using
     *  the Fast and Slow pointer approach as mentioned in Find Middle Of Linked List.
     *
     * -- Recursively sort each sublist and combine it into a single sorted list. (Merge Phase).
     *  This is similar to the problem Merge two sorted linked lists.
     *
     * The process continues until we get the original list in sorted order.
     */
    public static ListNode topDownMergeSort(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
         //slow;
        return head;
    }

    public static ListNode middleOfList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
