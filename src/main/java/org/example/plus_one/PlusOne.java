package org.example.plus_one;

import java.util.Arrays;
// https://leetcode.com/problems/plus-one/
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int last = digits.length - 1;
        boolean next = false;
        for (; last >= 0; last--) {
            // Processed last digit.
            if (last == digits.length - 1 && digits[last] == 9) {
                digits[last] = 0;
                next = true;
            } else if (last == digits.length - 1) {
                digits[last]++;
                return digits;
            } else if (next && digits[last] == 9) {
                digits[last] = 0;
            } else {
                digits[last]++;
                return digits;
            }
        }

        if (digits[0] == 0) {
            int[] result = Arrays
                    .copyOf(digits, digits.length + 1);
            result[0] = 1;
            return result;
        }
        return digits;
    }
}
