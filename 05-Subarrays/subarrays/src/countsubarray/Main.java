package countsubarray;

public class Main {
    public static void main(String[] args) {
        int[] A = {2, 5, 6};
        int B = 10;

        Solution sol = new Solution();
        int count = sol.countSubarray(A, B);

        System.out.println("Count Subarray Result: " + count);

    }
}
