package rotatematrix;

public class Solution {
    public void rotateMatrix(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < m; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i = 0 ; i < n; i++) {
            for(int j = 0, x = m - 1; j < x; j++, x--) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][x];
                mat[i][x] = temp;  
            } 
        }

        printMatrix(mat);
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
