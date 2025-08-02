package diagonalsum;

public class Solution {
    public int mainDiagonalSum(int[][] mat) {
        int n = mat.length, sum = 0;

        for(int i = 0; i < n; i++) { sum += mat[i][i]; }

        return sum;
    }

    public int minorDiagonalSum(int[][] mat) {
        int n = mat.length, m = mat[0].length, sum = 0;

        for(int i = 0, j = m - 1; i < n; i++, j--) {
            sum += mat[i][j];
        }

        return sum;
    }
}


// Time Complexity: O(N)
// Space Complexity: O(1)