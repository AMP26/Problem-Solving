package matricesequal;

public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {7, 8, 9}, {4, 5, 6}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Solution sol = new Solution();
        boolean result = sol.checkEqual(arr1, arr2);

        System.out.println("Are Matrices Same? " + result);
    }
}
