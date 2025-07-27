package subtractmatrix;

public class Solution {
    public void subtractMatrix(int[][] mat1, int[][] mat2) {
        int n = mat1.length, m = mat2[0].length; // mat1 & mat2 dimensions should be same
        int[][] result = new int[n][m];

        for(int i = 0; i < n ; i++) {
            for(int j = 0; j < m; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }

        System.out.println("Result: ");
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
