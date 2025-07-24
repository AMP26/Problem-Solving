package allsubarraysum;

public class Main {
    public static void main(String[] args) {
        int[] A = {2, 1, 3};

        Solution sol = new Solution();
        int result = sol.allSubarraySum(A);

        System.out.println("Sum of all Subarrays: " + result);
    }
}
