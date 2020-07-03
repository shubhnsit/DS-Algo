package com.dynamicProgramming;

public class EditDistance {


    public static void main(String[] args) {

        String str1 = "gesk";
        String str2 = "gsek";

        int operations = minDistance(str1.toCharArray(), str2.toCharArray(),
                str1.toCharArray().length, str2.toCharArray().length);  // complexity 3 ki power m
        int operationsDp = minDistanceDP(str1.toCharArray(), str2.toCharArray(),
                str1.toCharArray().length, str2.toCharArray().length); // complexity

    }

    private static int minDistanceDP(char[] first, char[] second, int m, int n) {

        int[][] editDistance = new int[m+1][n+1];


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(i==0){
                    editDistance[i][j] = j;
                }

                if(j==0){
                    editDistance[i][j] = i;
                }

                if(first[i]==second[j]){
                    editDistance[i][j] = editDistance[i-1][j-1];
                }
                else{
                    editDistance[i][j] = 1 + min(editDistance[i-1][j],editDistance[i][j-1],editDistance[i-1][j-1]);
                }

            }
        }

        return editDistance[m][n];
    }


    private static int minDistance(char[] first,char[] second,int m,int n) {


        if(m==0){
            return n;
        }

        if(n==0){
            return m;
        }

        if(first[m-1] == second[n-1]){
         return minDistance(first,second,m-1,n-1);
        }

        else{
        return 1 + min(minDistance(first,second,m,n-1),
                minDistance(first,second,m-1,n), minDistance(first,second,m-1,n-1));
        }

    }

    static int min(int a,int b,int c){
        return a;
    }

}
