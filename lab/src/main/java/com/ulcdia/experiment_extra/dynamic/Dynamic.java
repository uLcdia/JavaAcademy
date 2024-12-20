package com.ulcdia.experiment_extra.dynamic;

import java.util.Scanner;

public class Dynamic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n >= 4 && n <= 1000) {
            System.out.println(solve(n));
        } else {
            System.out.println("Please enter a number between 4 and 1000");
        }
    }

    // https://www.cnblogs.com/yuhan-blog/p/12308995.html
    public static long solve(int n) {
        final int MOD = 1000000007;
        long[][] dp = new long[n][6];
        dp[0][0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i][1] = (1 + dp[i - 1][1] * 2) % MOD;
            dp[i][2] = (1 + dp[i - 1][2]) % MOD;
            dp[i][3] = (dp[i - 1][1] + dp[i - 1][2] + dp[i - 1][3] * 2) % MOD;
            dp[i][4] = (dp[i - 1][1] + dp[i - 1][4] * 2) % MOD;
            dp[i][5] = (dp[i - 1][3] + dp[i - 1][4] + dp[i - 1][5] * 2) % MOD;
        }
        return dp[n - 1][5];
    }
}
