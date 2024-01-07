[LeetCode Task](https://leetcode.com/problems/climbing-stairs/)
# Intuition
The problem involves finding the number of distinct ways to climb a staircase with n steps. At each step, you can either climb 1 or 2 steps. The intuition here is that the total number of distinct ways to reach step i is the sum of the distinct ways to reach steps (i-1) and (i-2). This recurrence relation is similar to the Fibonacci sequence.

# Approach
The approach involves using dynamic programming to build a solution iteratively. We create an array dp where dp[i] represents the number of distinct ways to climb to step i. We initialize the base cases dp[0] and dp[1] to 1 since there is only one way to climb 0 or 1 step.

We then iterate from step 2 to n, calculating dp[i] = dp[i-1] + dp[i-2] for each step. The final result is dp[n], representing the number of distinct ways to climb to the top of the staircase with n steps.

# Complexity
- Time complexity:
  The time complexity is linear because we iterate through the steps from 2 to n once.

- Space complexity:
  The space complexity is also linear because we use an array of size n+1 to store the intermediate results.

# Code
```
class Solution {
     public int climbStairs(int n) {
    if (n <= 1) {
        return 1;
    }

    int[] dp = new int[n + 1];
    dp[0] = 1;
    dp[1] = 1;

    for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
 }
}
```