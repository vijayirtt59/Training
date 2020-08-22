package com.vijay.interview.chap1;

public class ZeroMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{0,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        printMatrix(matrix);

        loadZeroArray(matrix);
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix){

        for(int i =0; i< matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void  loadZeroArray(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for(int i=0; i< row.length; i++){
            if(row[i]){
                nullifyRow(matrix, i);
            }
        }

        for(int i=0; i< column.length; i++){
            if(column[i]){
                nullifyColumn(matrix, i);
            }
        }
    }

    public static void nullifyRow(int[][]matrix, int row){
        for(int i=0; i< matrix[0].length; i++){
            matrix[row][i] =0;
        }
    }
    public static void nullifyColumn(int[][]matrix, int column){
        for(int i=0; i< matrix.length; i++){
            matrix[i][column] =0;
        }
    }
}
