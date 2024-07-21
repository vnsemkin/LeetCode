package org.example.merge_sorted_array;

// https://leetcode.com/problems/merge-sorted-array/description/
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers for nums1, nums2, and merged array
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        // Merge nums1 and nums2 starting from the end
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are remaining elements in nums2, copy them
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
