package com.dynamicProgramming;

public class LCS {

    public static void main(String[] args) {
        char[] first = "ABCDGH".toCharArray();
        char[] second = "AEDFHR".toCharArray();
      /*  int lcs = lcs(first,second,first.length,second.length);  // complexity is 2 power n in worst case, worst case occurs when no element matches lcs = 0
        System.out.print(lcs);
      */  int lcsDP = lcsDP(first,second,first.length,second.length); // complexity O(mn) when m=n -> nsquare
        System.out.print(lcsDP);
    }


    private static int lcsDP(char[] first, char[] second, int m, int n) {

        int[][] lcs= new int[m+1][n+1];

        for(int i=0;i<=m;i++){

            for(int j=0;j<=n;j++){

                if(i==0 || j==0){
                    lcs[i][j] = 0;
                }

               else if(first[i-1]==second[j-1]){
                    lcs[i][j] = 1 + lcs[i-1][j-1];
                }
                else
                lcs[i][j] = Math.max(lcs[i][j-1],lcs[i-1][j]);

            }
        }

        return lcs[m][n];

    }


    private static int lcs(char[] first, char[] second, int n1, int n2) {

        if(n1==0 || n2==0){
            return 0;
        }

        if(first[n1-1]==second[n2-1]){
            return 1 + lcs(first,second,n1-1,n2-1);
        }
        else {
            return Math.max(lcs(first, second, n1 - 1, n2), lcs(first, second, n1, n2 - 1));
        }


    }




}

