package maxsubarray;

public class Main {
    public static void main(String[] args) {
        int[] C = {2, 2, 2};
        int A = 3, B = 1;

        Solution sol = new Solution();
        int result = sol.maxSubarray(A, B, C);

        System.out.println("Max Subarray: " + result);
    }
}
