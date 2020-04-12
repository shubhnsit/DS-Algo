package com.matrix;

public class PrintUniquePaths {


    public static void main(String[] args) {

        int mat[][] = { {1,2,3},
                        {5,6,7},
                        {9,10,11}};

        int m = mat.length;
        int n = mat[0].length;
        int path[] = new int[m+n];
        printUniquePaths(mat,m,n,0,0,path,0);

    }

    private static void printUniquePaths(int[][] mat, int m, int n,int i,int j,int path[],int idx) {

        path[idx] = mat[i][j];

         if(i==m-1){
             for(int k= j+1;k<n;k++){
                 path[idx + k -j] = mat[i][k];
             }
             for(int l=0;l<idx+n-j;l++) {
                 System.out.print(path[l] + "   ");
             }
             System.out.println();
             return;
         }

        if(j==n-1){
            for(int k= i+1;k<m;k++){
                path[idx + k -i] = mat[k][j];
            }
            for(int l=0;l<idx+m-i;l++) {
                System.out.print(path[l] + "   ");
            }
            System.out.println();
            return;
        }


         printUniquePaths(mat,m,n,i+1,j,path,idx+1);
         printUniquePaths(mat,m,n,i,j+1,path,idx+1);



    }






}






