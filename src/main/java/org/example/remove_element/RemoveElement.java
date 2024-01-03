package org.example.remove_element;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int[] expectedNums = Arrays.stream(nums).filter(i -> i != val).toArray();
        System.arraycopy(expectedNums, 0, nums, 0, expectedNums.length);
        return expectedNums.length;
    }
}
