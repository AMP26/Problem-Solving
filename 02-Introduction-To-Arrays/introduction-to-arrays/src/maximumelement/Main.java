package maximumelement;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 1, 5};
        int B = 3;

        Solution sol = new Solution();

        int result = sol.minOperations(arr, B);
        System.out.println("Minimum Operations Required: " + result);
    }
}