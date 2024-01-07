package org.example.sqrt_x;

// https://leetcode.com/problems/sqrtx/submissions/1139291504/
public class SqrtX {
    public int mySqrt(int x) {
        double guess = x / 2.0;  // Initial guess
        for (int i = 0; i < 10; i++) {  // Adjust the number of iterations as needed
            guess = 0.5 * (guess + x / guess);
        }
        return (int) guess;
    }
}
