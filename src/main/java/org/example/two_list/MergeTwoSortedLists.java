package org.example.two_list;

import java.util.Objects;
// https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLists {
    public MyListNode mergeTwoLists(MyListNode list1, MyListNode list2) {
        if (Objects.nonNull(list1) && Objects.nonNull(list2)) {
            if (list1.val <= list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if (list1 != null) {
            return list1;
        } else {
            return list2;
        }
    }
}
