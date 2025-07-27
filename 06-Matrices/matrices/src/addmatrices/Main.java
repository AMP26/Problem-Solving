package addmatrices;

public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 1, 2}, {7, 8, 9}};
        int[][] arr2 = {{9, 9, 7}, {1, 2, 4}, {4, 6, 3}};

        Solution sol = new Solution();
        int[][] result = sol.addMatrix(arr1, arr2);

        System.out.println("Result: ");
        sol.printMatrix(result);
    }
}
