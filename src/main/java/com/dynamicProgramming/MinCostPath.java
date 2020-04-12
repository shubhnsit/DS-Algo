package com.dynamicProgramming;

public class MinCostPath {


    public static void main(String[] args) {
        int cost[][] = { {1, 2, 3},
                         {4, 8, 2},
                         {1, 5, 3} };

        System.out.print(minCost(cost, 2, 2));
    }

    private static int minCost(int[][] cost, int m, int n) {

        int minCost[][] = new int[m+1][n+1];


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(i==0 && j==0){
                    minCost[i][j] = cost[i][j];
                }

                else if(i==0){
                     minCost[0][j] = minCost[0][j-1] + cost[0][j];
                }

                else if(j==0){
                    minCost[i][0] = minCost[i-1][0] + cost[i][0];
                }

                else
                    minCost[i][j] = Math.min(minCost[i][j-1],minCost[i-1][j]) + cost[i][j];


            }
        }

        return minCost[m][n];



    }

}
