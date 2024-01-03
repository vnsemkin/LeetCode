package org.example.last_word;
// https://leetcode.com/problems/length-of-last-word/
public class LastWord {
    public int lengthOfLastWord(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        char[] charArray = stringBuilder.reverse().toString().toCharArray();
        int count = 0;
        for (int i = 0, j = 1; j < charArray.length; i++, j++) {
            if (charArray[i] == 32) continue;
            if (charArray[j] != 32 && charArray[i] != 32) {
                count++;
            }
            if (charArray[i] != 32 && charArray[j] == 32) return count + 1;
        }
        return count;
    }
}
