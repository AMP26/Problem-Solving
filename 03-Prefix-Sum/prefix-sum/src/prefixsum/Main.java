package prefixsum;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Solution sol = new Solution();
        int[] result = sol.prefixSum(arr);

        System.out.println("Prefix Sum Array: ");
        for(int n : result) { System.out.print(n + " "); }
    }
}
