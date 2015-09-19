package com.anku.matrix;

class MatrixSubtraction {
    public static void main(String[] args) {
        int i, j;
        int[][] A = {{1, 2, 3}, {1, 0, 1}, {2, 0, 0}};
        System.out.println("matrix A is:");

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        int[][] B = {{4, 0, 1}, {0, 0, 2}, {3, 2, 1}};
        System.out.println("matrix B is:");

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        int[][] C = new int[3][3];
        System.out.println("Subtraction of matrix A and matrix B is:");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                C[i][j] = A[i][j] - B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
