package com.matrix;

public class SpiralOrder {


    public static void main(String[] args) {

        int mat[][] = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

      //  printMatrix(mat,4,4);
        spiralOrder(mat,4,4);

    }

    private static void printMatrix(int[][] mat, int m, int n) {

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j] + "   ");
            }
            System.out.println(" ");

        }
    }

    private static void spiralOrder(int mat[][],int m,int n){
         // k starting row index
        //  l starting column index
        //  m ending row index
        //  n ending column index
        int k=0,l=0;
        while (k < m && l < n) {
            for (int i = l; i < n; i++) {
                System.out.print(mat[k][i] + " ");
            }
            k++;
            for (int i = k; i < m; i++) {
                System.out.print(mat[i][n - 1] + " ");
            }
            n--;
            if (k < m) {
                for (int i = n - 1; i >= l; i--) {
                    System.out.print(mat[m - 1][i] + " ");
                }
                m--;
            }
            if (l < n) {
                for (int i = m - 1; i >= k; i--) {
                    System.out.print(mat[i][l] + " ");
                }
                l++;
            }
        }
    }

}






