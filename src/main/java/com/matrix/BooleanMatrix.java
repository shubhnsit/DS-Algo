package com.matrix;

public class BooleanMatrix {


    public static void main(String[] args) {

        int mat[][] = { {0,0,0,0},
                        {0,1,1,0},
                        {0,0,0,0}};
        int m = mat.length;
        int n = mat[0].length;
        int res[][] = new int[m+1][n+1];
        System.out.println("matrix before output");
        printMatrix(mat,m,n);
        booleanMatrixOptimized(mat,m,n);
        System.out.println("matrix after output");
        printMatrix(mat,m,n);

    }

    private static void booleanMatrixOptimized(int mat[][],int m,int n){
        int R[] = new int[m];
        int C[] = new int[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(mat[i][j]==1){
                    R[i] = 1;
                    C[j] = 1;
                }

            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                if (R[i] == 1 || C[j] == 1) {
                    mat[i][j] = 1;
                }
            }
        }


    }

    //  row =1, col=2,  m=3,n=3
    private static void fillResultMatrix(int[][] res, int rowIndex, int colIndex, int m, int n) {

        for(int i=0;i<n;i++){
            res[rowIndex][i] = 1;
        }

        for(int i=0;i<m;i++){
            res[i][colIndex] = 1;
        }

    }

    private static void printMatrix(int[][] mat, int m, int n) {

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j] + "   ");
            }
            System.out.println(" ");

        }
    }

    private static void booleanMatrix(int mat[][],int[][] res,int m,int n){

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(mat[i][j]==1){
                    fillResultMatrix(res,i,j,m,n);
                }

            }

        }


    }



}






