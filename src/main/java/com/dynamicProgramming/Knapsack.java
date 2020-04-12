package com.dynamicProgramming;

// A Dynamic Programming based solution for 0-1 Knapsack problem
class Knapsack
{

    // A utility function that returns maximum of two integers
    static int max(int a, int b) { return (a > b)? a : b; }

    // Returns the maximum value that can be put in a knapsack of capacity W
    static int knapSack(int W, int weight[], int val[], int n)
    {
        int i, j;
        int K[][] = new int[n+1][W+1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++)
        {
            for (j = 0; j <= W; j++)
            {
                if (i==0 || j==0)
                    K[i][j] = 0;
                else if (weight[i-1] <= j)
                    K[i][j] = max(val[i-1] + K[i-1][j-weight[i-1]], K[i-1][j]);
                else
                    K[i][j] = K[i-1][j];
            }
        }

        return K[n][W];
    }


    // Driver program to test above function
    public static void main(String args[])
    {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int W = 50;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}
/*This code is contributed by Rajat Mishra */
