package matrixmultiplication;

public class Solution {
    public void matrixMul(int[][] mat1, int[][] mat2) {
        int n = mat1.length, m = mat1[0].length;
        int a = mat2.length, b = mat2[0].length;

        if(n != b) {
            System.out.println("Matrix Multiplication Not Possible");
            return;
        }

        int[][] result = new int[n][b];
         for(int i = 0; i < n; i++) {
             for(int j = 0; j < b; j++) {
                 for(int k = 0; k < n; k++) {
                     result[i][j] += mat1[i][k] * mat2[k][j];
                 }
             }
         }
         printMatrix(result);
    }

    private void printMatrix(int[][] mat) {
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0 ; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

// Time Complexity: O(N * N * N)
// Space Complexity: O(N)
