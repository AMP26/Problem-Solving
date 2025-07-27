package addmatrices;

public class Solution {
    public int[][] addMatrix(int[][] mat1, int[][] mat2) {
        int n = mat1.length, m = mat1[0].length;
        int[][] result = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        return result;
    }

    public void printMatrix(int[][] mat) {
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0 ; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
