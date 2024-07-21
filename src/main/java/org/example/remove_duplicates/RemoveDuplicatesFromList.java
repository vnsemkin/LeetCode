package org.example.remove_duplicates;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDuplicatesFromList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next; // Skip the duplicate node
            } else {
                current = current.next; // Move to the next distinct element
            }
        }
        return head;
    }
}