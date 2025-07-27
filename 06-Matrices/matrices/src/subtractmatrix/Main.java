package subtractmatrix;

public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        Solution sol = new Solution();
        sol.subtractMatrix(arr1, arr2);
    }
}
