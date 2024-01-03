package org.example.search_insert;

// https://leetcode.com/problems/search-insert-position/
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) return i;
            if (target < nums[i]) return i - 1;
        }
        return nums.length;
    }
}
