package specialsubsequence;

public class Main {
    public static void main(String[] args) {
        String A = "ABCGAG";

        Solution sol = new Solution();
        int result = sol.specialSubsequence(A);

        System.out.println("No. of subsequence \"AG\" is there in the given string: " + result);
    }
}
