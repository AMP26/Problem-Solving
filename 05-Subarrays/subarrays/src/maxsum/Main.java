package maxsum;

public class Main {
    public static void main(String[] args) {
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int[] A = {-1, -2, -3};

        Solution sol = new Solution();
        int result = sol.maxSum(A);

        System.out.println("Maximum Sum: " + result);
    }
}
