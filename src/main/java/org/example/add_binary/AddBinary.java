package org.example.add_binary;
import java.math.BigInteger;

// https://leetcode.com/problems/add-binary/
public class AddBinary {
    public String addBinary(String a, String b) {
        BigInteger number1 = new BigInteger(a,2);
        BigInteger add = number1.add(new BigInteger(b,2));
        return add.toString(2);
    }
}
