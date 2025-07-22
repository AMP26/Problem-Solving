package rangesum;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] b = {{0, 3}, {1, 2}};

        Solution sol = new Solution(arr, b);

        int[] result = sol.rangeSum();

        System.out.println("Result: "); // [10, 5]
        for(int n : result) { System.out.print(n + " "); }
    }
}