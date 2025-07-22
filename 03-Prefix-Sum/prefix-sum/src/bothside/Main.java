package bothside;

public class Main {
    public static void main(String[] args) {

        int[] arr = {5, -2, 3 , 1, 2};
        int b = 3;

        Solution sol = new Solution();
        int maxSum = sol.pickSides(arr, b);

        System.out.println("Maximum Sum: " + maxSum);
    }
}