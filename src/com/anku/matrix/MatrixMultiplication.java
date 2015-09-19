package com.anku.matrix;

class MatrixMultiplication {
    public static void main(String[] args) {
        int i, j, k;
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
        System.out.println("Multiplication of matrix A and matrix B is:");

        for (i = 0; i <= 2; i++) {
            for (k = 0; k <= 2; k++) {
                for (j = 0; j <= 2; j++) {
                    C[i][k] = C[i][k] + A[i][j] * B[j][k];
                }
                System.out.print(C[i][k] + " ");

            }
            System.out.println();
        }

    }
}
