package goodsubarrays;


public class Main {
    public static void main(String[] args) {
        int[] A = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
        int B = 65;

        Solution sol = new Solution();
        int result = sol.goodSubarray(A, B);

        System.out.println("No. of Good Subarrays: " + result);
    }
}
