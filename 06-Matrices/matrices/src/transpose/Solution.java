package transpose;

public class Solution {

    public void transpose(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int[][] result = new int[m][n];

        for(int j = 0; j < m; j++) {
            for(int i = 0; i < n; i++) { result[j][i] = mat[i][j]; }
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


// Time Complexity: O(N * M)
// Space Complexity: O(N * M)