package com.vijay.interview.chap1;

public class MatrixRotatation {


    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        pringMatrix(matrix);

        rotate(matrix);
        pringMatrix(matrix);
    }

    public static void pringMatrix(int[][] matrix){
        System.out.println("length: " + matrix.length);
        System.out.println("length of 0: " + matrix[0].length);
        for(int i = 0; i< matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    /**
     * 4*4 matrix
     *
     * @param matrix
     */
    public static void rotate(int[][] matrix){
        if(matrix.length ==0 || matrix.length != matrix[0].length){
            return;
        }
        int n = matrix.length;
        for(int layer =0; layer <n/2; layer++){
            int first = layer;
            int last = n - layer - 1;
            for(int i=first; i<last; i++){
                int offset = i - first;

                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
    }
}
