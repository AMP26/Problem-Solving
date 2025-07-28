package matrixmultiplication;

public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {3, 4}};
        int[][] arr2 = {{5, 6}, {7, 8}};

        Solution sol = new Solution();
        sol.matrixMul(arr1, arr2);
    }
}