package org.example.remove_duplicates;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromArray {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
