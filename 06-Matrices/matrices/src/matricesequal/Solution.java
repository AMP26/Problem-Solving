package matricesequal;

public class Solution {
    public boolean checkEqual(int[][] mat1, int[][] mat2) {
        int n = mat1.length, m = mat1[0].length;
        int a = mat2.length, b = mat2[0].length;

        if(a != n || b != m) { return false; }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(mat1[i][j] == mat2[i][j]){ return false; }
            }
        }
        return true;
    }
}
