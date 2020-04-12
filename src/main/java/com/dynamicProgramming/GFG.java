package com.dynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class GFG {

    public static int minOp(int m,int n) {
        int dp[] = new int[n + 1];
        dp[0] = m;
        dp[1] = m;
        for (int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            if (i % 2 == 0) {
                min = dp[i / 2]+1;
            }
            min = Math.min(min, dp[i - 1]+1);
            dp[i]=min;
        }


        return dp[n];
    }

    public static void main(String[] args) throws Exception{

        int result = minOp(2,5);
        System.out.print(result);


    }
}