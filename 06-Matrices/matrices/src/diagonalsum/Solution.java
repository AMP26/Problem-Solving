package diagonalsum;

public class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length, sum = 0;

        for(int i = 0; i < n; i++) { sum += mat[i][i]; }

        return sum;
    }
}
