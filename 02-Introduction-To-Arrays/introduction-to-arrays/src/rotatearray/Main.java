package rotatearray;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
//      int k = 9;

        Solution sol = new Solution();
        sol.rotateArray(nums, k);
    }
}