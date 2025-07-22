package equalityarray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 2};

        Solution sol = new Solution();
        int result = sol.equalityArray(arr);

        System.out.println("Minimum Operations Required: " + result);
    }
}