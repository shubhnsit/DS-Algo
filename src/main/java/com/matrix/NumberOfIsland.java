package com.matrix;

public class NumberOfIsland {


    public static void main(String[] args) {

        int mat[][] = { {0,0,1,0},
                        {1,1,1,1},
                        {0,0,0,1}
                        };
        int m = mat.length;
        int n = mat[0].length;
        System.out.println("matrix before output");
        printMatrix(mat,m,n);
        noOfIslands(mat,m,n);
        System.out.println("matrix after output");
        printMatrix(mat,m,n);

    }


    private static void noOfIslands(int[][] mat, int m, int n) {

        boolean[][] visited = new boolean[m+1][n+1];

        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){

                if(mat[i][j] == 1 && !visited[i][j]){



                }

            }

        }

    }




    private static void printMatrix(int[][] mat, int m, int n) {

        int count =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 1){
                    count++;
                }
                System.out.print(mat[i][j] + "   ");
            }
            System.out.println(" ");

        }
        System.out.println(count);
    }




}






