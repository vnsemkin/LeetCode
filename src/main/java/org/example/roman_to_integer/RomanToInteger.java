package org.example.roman_to_integer;

public class RomanToInteger {
    public int romanToInt(String s) {
        char[] charArray = s.toCharArray();
        int size = charArray.length;
        int result = 0;
        int prev = 0;
        for (int i = size - 1; i >= 0; i--) {
            int number = RomanNumeral.valueOf(String.valueOf(charArray[i])).getValue();
            if (number < prev) {
                result -= number;
            } else {
                result += number;
            }
            prev= number;
        }

        return result;
    }
    public enum RomanNumeral {
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

        private final int value;

        RomanNumeral(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
