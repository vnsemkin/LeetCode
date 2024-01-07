#### [LeetCode Task](https://leetcode.com/problems/sqrtx/description/)
# Intuition
The approach is using the Babylonian method to approximate the square root of the given number x. The algorithm starts with an initial guess (guess = x / 2.0) and iteratively refines it using the formula guess = 0.5 * (guess + x / guess).

# Approach
Initialize the guess variable to x / 2.0.
Iterate 19 times, updating the guess using the Babylonian method formula in each iteration.
Return the integer part of the final guess as the result.

# Complexity
- Time complexity:
  Time complexity: O(log n)
  The time complexity depends on the number of iterations, and in this case, it is set to a fixed value (19). The iterative method used converges quickly, providing a logarithmic time complexity.

- Space complexity:
  Space complexity: O(1)
  The algorithm uses a constant amount of space, regardless of the input.

# Code
```
class Solution {
    public int mySqrt(int x) {
    double guess = x / 2.0;  // Initial guess
    for (int i = 0; i < 19; i++) {  // Adjust the number of iterations as needed
        guess = 0.5 * (guess + x / guess);
    }
    return (int) guess;
    }
}
```